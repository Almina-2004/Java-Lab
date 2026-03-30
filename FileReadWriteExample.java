import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String fileName = "example.txt"; // File to write to and read from
        String contentToWrite = "Hello, this is a sample text.\nWelcome to Java file handling!";

        // 1. Writing to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(contentToWrite);
            System.out.println("Data has been written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // 2. Reading from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nContents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Display each line on console
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}