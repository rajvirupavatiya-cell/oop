public class VotingApp {

    // Method to check eligibility
    public static void checkEligibility(int age) {
        if (age < 18) {
            // Explicitly throw exception
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    // Main method
    public static void main(String[] args) {

        int[] testAges = {16, 18, 21}; // different test inputs

        for (int age : testAges) {
            try {
                System.out.println("\nChecking age: " + age);
                checkEligibility(age);
            } 
            catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());
            } 
            finally {
                System.out.println("Validation process completed");
            }
        }
    }
}
