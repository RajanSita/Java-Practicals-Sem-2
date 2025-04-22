import java.io.*;
import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File Copy Program");
        System.out.println("================");
        
        System.out.print("Enter source file path: ");
        String sourceFilePath = scanner.nextLine();
        
        System.out.print("Enter destination file path: ");
        String destFilePath = scanner.nextLine();
        
        try {
            copyFileUsingStreams(sourceFilePath, destFilePath);
            System.out.println("\nFile copied successfully!");
            
            System.out.print("\nDo you want to view the content of the copied file? (y/n): ");
            String response = scanner.nextLine();
            
            if (response.equalsIgnoreCase("y")) {
                displayFileContent(destFilePath);
            }
            
        } catch (IOException e) {
            System.out.println("\nError copying file: " + e.getMessage());
        }
        
        scanner.close();
    }
    private static void copyFileUsingStreams(String source, String destination) throws IOException {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            
            System.out.println("\nCopying file...");
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            
            fos.flush();
        }
    }
    private static void displayFileContent(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("\nFile Content:");
            System.out.println("------------");
            
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            System.out.println("------------");
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}