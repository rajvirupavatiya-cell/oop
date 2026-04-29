import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCounter {
    public static void main(String[] args) {

        // Check if filename is provided
        if (args.length == 0) {
            System.out.println("Usage: java FileCounter <filename>");
            return;
        }

        String fileName = args[0];

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                // Count characters (excluding newline)
                charCount += line.length();

                // Split words based on whitespace
                String[] words = line.trim().split("\\s+");

                // Handle empty lines
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }
            }

            // Display results
            System.out.println("File: " + fileName);
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
