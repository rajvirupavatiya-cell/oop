import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter a single letter: ");
        String input = scanner.next();

        // Validate input length
        if (input.length() != 1) {
            System.out.println("Please enter exactly one character.");
        } else {
            char ch = input.charAt(0);

            // Check if alphabet
            if (!Character.isLetter(ch)) {
                System.out.println("Invalid input. Please enter an alphabet letter.");
            } else {
                // Convert to lowercase for case-insensitive check
                ch = Character.toLowerCase(ch);

                // Check vowel or consonant
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("The character is a Vowel.");
                } else {
                    System.out.println("The character is a Consonant.");
                }
            }
        }

        scanner.close();
    }
}
