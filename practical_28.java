import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataFileCounter {
    public static void main(String[] args) {

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                // Count characters excluding spaces
                charCount += line.replaceAll("\\s", "").length();

                // Count words (split by whitespace)
                String[] words = line.trim().split("\\s+");

                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            // Display results
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces & newlines): " + charCount);

        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File 'data.txt' not found.");
        } 
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } 
        finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
            System.out.println("File processing completed.");
        }
    }
}
