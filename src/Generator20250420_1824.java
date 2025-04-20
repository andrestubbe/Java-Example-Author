import org.json.JSONObject;

import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

//javac -cp json.jar YourClass.java
//java -cp .;json.jar YourClass

public final class Generator20250420_1824 {

    private static final String INPUT_FILE = "jdk_methods.txt"; // Input file with class names
    private static final String OUTPUT_ROOT = "java_examples";
    private static final String STRING_FILETYPE = ".java";
    private static final String STRING_POSTFIX = "_Example";
    private static final String STRING_URI = "http://localhost:11434/api/generate";

    public static void main(String[] args) {
        final int startIndex = Integer.parseInt(args[0]);
        new Generator20250420_1824(startIndex);
    }

    public Generator20250420_1824(final int startIndex) {
        final List<String> paths = createClassNames(INPUT_FILE);

        for (int i = startIndex, pathsSize = paths.size(); i < pathsSize; i++) {
            final String path = paths.get(i);
            try {
                System.out.println("line:    " + i);
                System.out.println("current: " + path);
                final int hashIndex = path.indexOf('#');
                final String cleanPath = (hashIndex != -1) ? path.substring(0, hashIndex) : path;
                final String methodName = (hashIndex != -1) ? path.substring(hashIndex + 1) : "";
                final String packageName = "examples."+ cleanPath.substring(0, cleanPath.lastIndexOf('.'));
                final String className = cleanPath.substring(cleanPath.lastIndexOf('.') + 1);
                final String fileName = className + (methodName.isEmpty() ? "" : "_" + methodName) + STRING_POSTFIX + STRING_FILETYPE;
                final String prompt = ""
                        + "IMPORTANT: Respond ONLY with the raw Java code requested below. Do NOT include explanations, "
                        + "introductory/closing remarks, only pure java code that can be directly pasted into a java file and used."
                        + "GenTask: create a runnable Java code example using the `" + className + "` class"
                        + "within a single Java file.  The code must be runnable. "
                        + "Ensure the code starts with `package " + packageName + "` "
                        + "and includes a public class named `" + fileName + "`. "
                        + "Include necessary imports. "
                        + "Create necessary inline comments for the class relevant lines. "
                        + "Output ONLY the raw Java code block. "
                        + "Write the smallest version possible. the command of the class name must become visible in action. "
                        + "Describe in Detail what the example does and what it is good for in the header javadoc and explain its result in it. "
                        + "Hard-wrap after the javadoc always at 100 symbols, format the code in this way. "
                        + "Write clean code. "
                        + "Write for JDK17";
                try {
                    final String response = requestStream(prompt);
                    final String code = this.extractCode(response);
                    saveCodeToFile(OUTPUT_ROOT, code, packageName, fileName);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private List<String> createClassNames(final String file) {
        final File inputFile = new File(file);
        return this.readClassNames(inputFile);
    }

    private List<String> readClassNames(final File file) {
        try {
            return Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String requestStream(final String text) throws IOException, InterruptedException {

        final HttpClient client = HttpClient.newHttpClient();
        final String json = "{\"model\": \"stable-code\", \"prompt\": \"" + text.replace("\"", "\\\"") + "\", \"stream\": true}";
        final HttpRequest request = HttpRequest.newBuilder().uri(URI.create(STRING_URI)).header("Content-Type", "application/json").POST(HttpRequest.BodyPublishers.ofString(json)).build();
        final HttpResponse<InputStream> response = client.send(request, HttpResponse.BodyHandlers.ofInputStream());
        final StringBuilder fullResponse = new StringBuilder();


        try (final InputStream inputStream = response.body();
             final InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
             final BufferedReader reader = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Parse each line as a JSON object
                JSONObject jsonResponse = new JSONObject(line);
                String extractedResponse = jsonResponse.getString("response");
                System.out.print(extractedResponse);
                Thread.sleep(10);
                fullResponse.append(extractedResponse);
                if (jsonResponse.getBoolean("done")) {
                    break;
                }
            }
            System.out.println("----------------------------------------------------------------------------------------");
        }
        return fullResponse.toString();
    }

    private void saveCodeToFile(final String outputRoot, final String codeContent, final String packageName, final String className) {
        final String other = packageName.replace('.', File.separatorChar);
        final Path rootPath = Paths.get(outputRoot);
        final Path packagePath = rootPath.resolve(other);
        final Path filePath = packagePath.resolve(className);
        try {
            if (!Files.exists(packagePath)) {
                Files.createDirectories(packagePath);
            }
            Files.writeString(filePath, codeContent, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String extractCode(String text) {
        final int start = text.indexOf("```java");
        final int end = text.lastIndexOf("```");

        if (start != -1 && end > start) {
            text = text.substring(start + 7, end).trim();
        } else {
            int codeStartIndex = text.indexOf("package");
            if (codeStartIndex != -1) {
                text = text.substring(codeStartIndex);
            }
            int codeEndIndex = text.lastIndexOf("}");
            if (codeEndIndex != -1 && codeEndIndex > 0) {
                text = text.substring(0, codeEndIndex + 1);
            }
        }
        return text;
    }

}