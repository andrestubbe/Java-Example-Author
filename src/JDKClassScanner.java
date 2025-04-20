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

public class JDKClassScanner {
    public static void main(String[] args) {
        String outputFile = "jdk_classes_with_methods.txt";
        List<String> classDetails = new ArrayList<>();
        
        try {
            // Get all JDK modules from the ModuleLayer
            Set<ModuleReference> moduleReferences = ModuleLayer.boot()
                    .configuration()
                    .modules()
                    .stream()
                    .map(ResolvedModule::reference)
                    .collect(Collectors.toSet());
            
            System.out.println("Scanning JDK modules for classes and their methods...");
            
            // Process each module to extract class names and methods
            for (ModuleReference moduleRef : moduleReferences) {
                try (ModuleReader reader = moduleRef.open()) {
                    reader.list()
                          .filter(resource -> resource.endsWith(".class") && !resource.contains("module-info"))
                          .forEach(resource -> {
                              // Convert resource path to class name format
                              String className = resource.replace('/', '.').replace(".class", "");
                              try {
                                  // Load the class
                                  Class<?> clazz = Class.forName(className);
                                  // Get methods of the class
                                  Method[] methods = clazz.getDeclaredMethods();
                                  StringBuilder methodList = new StringBuilder();
                                  for (Method method : methods) {
                                      methodList.append(method.getName()).append(", ");
                                  }
                                  // Remove the last comma and space
                                  if (methodList.length() > 0) {
                                      methodList.setLength(methodList.length() - 2);
                                  }
                                  // Add class name and methods to the list
                                  classDetails.add(className + " -> Methods: [" + methodList + "]");
                              } catch (ClassNotFoundException e) {
                                  System.err.println("Class not found: " + className);
                              } catch (Throwable t) {
                                  System.err.println("Error processing class: " + className + " - " + t.getMessage());
                              }
                          });
                } catch (IOException e) {
                    System.err.println("Error reading module: " + e.getMessage());
                }
            }
            
            // Sort the class details alphabetically
            classDetails.sort(String::compareTo);
            
            // Write the class details to the output file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                for (String classDetail : classDetails) {
                    writer.write(classDetail);
                    writer.newLine();
                }
                System.out.println("Successfully wrote " + classDetails.size() + " JDK class details to " + outputFile);
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }
            
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}