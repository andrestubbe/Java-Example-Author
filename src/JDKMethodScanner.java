import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.module.ModuleReader;
import java.lang.module.ModuleReference;
import java.lang.module.ResolvedModule;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JDKMethodScanner {
    public static void main(String[] args) {
        String outputFile = "jdk_methods.txt";
        List<String> methodNames = new ArrayList<>();

        try {
            Set<ModuleReference> moduleReferences = ModuleLayer.boot()
                    .configuration()
                    .modules()
                    .stream()
                    .map(ResolvedModule::reference)
                    .collect(Collectors.toSet());

            System.out.println("Scanning JDK modules for methods...");

            for (ModuleReference moduleRef : moduleReferences) {
                try (ModuleReader reader = moduleRef.open()) {
                    reader.list()
                          .filter(resource -> resource.endsWith(".class") && !resource.contains("module-info"))
                          .forEach(resource -> {
                              String className = resource.replace('/', '.')
                                                        .replace(".class", "");
                              try {
                                  Class<?> clazz = Class.forName(className, false, ClassLoader.getSystemClassLoader());
                                  for (Method method : clazz.getDeclaredMethods()) {
                                      methodNames.add(clazz.getName() + "#" + method.getName());
                                  }
                              } catch (Throwable ignored) {}
                          });
                } catch (IOException e) {
                    System.err.println("Error reading module: " + e.getMessage());
                }
            }

            methodNames.sort(String::compareTo);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                for (String methodName : methodNames) {
                    writer.write(methodName);
                    writer.newLine();
                }
                System.out.println("Successfully wrote " + methodNames.size() + " JDK method names to " + outputFile);
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
