public class BankAccount {
    // Instance variables
    private String account_holder_name;
    private double balance;

    // Static variable (common for all accounts)
    private static double interest_rate = 5.0; // default 5%

    // Constructor
    public BankAccount(String name, double balance) {
        this.account_holder_name = name;
        this.balance = balance;
    }

    // Static method to update interest rate
    public static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("Interest rate updated to: " + interest_rate + "%");
    }

    // Method to calculate interest
    public double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    // Method to display account details and interest
    public void displayAccountDetails() {
        System.out.println("\nAccount Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Create accounts
        BankAccount acc1 = new BankAccount("Raj", 10000);
        BankAccount acc2 = new BankAccount("Priya", 20000);

        // Display initial details
        System.out.println("Before updating interest rate:");
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        // Update interest rate using static method
        BankAccount.updateInterestRate(7.5);

        // Display details after updating interest rate
        System.out.println("\nAfter updating interest rate:");
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
    }
}
