import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Create HashMap
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Convert to lowercase and split words
        String[] words = input.toLowerCase().split("\\s+");

        // Count frequency
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // Display results
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        scanner.close();
    }
}
