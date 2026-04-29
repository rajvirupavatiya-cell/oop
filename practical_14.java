import java.util.Scanner;

// Base class
class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    // Method to open account
    public void openAccount(String accNo, String name, double initialBalance) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = initialBalance;
        System.out.println("Account opened successfully!");
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Subclass: Saving Account
class SavingAccount extends BankAccount {
    private double interestRate = 4.0; // 4%

    public void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest Earned (Saving): " + interest);
    }
}

// Subclass: Fixed Deposit Account
class FixedDepositAccount extends BankAccount {
    private double interestRate = 6.5; // 6.5%
    private int years;

    public void setTerm(int years) {
        this.years = years;
    }

    public void maturityAmount() {
        // Simple interest formula
        double maturity = balance + (balance * interestRate * years) / 100;
        System.out.println("Maturity Amount (FD): " + maturity);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Saving Account
        SavingAccount sa = new SavingAccount();
        sa.openAccount("SA101", "Raj", 10000);
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println("\n----------------------\n");

        // Fixed Deposit Account
        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("FD201", "Priya", 20000);
        fd.setTerm(3); // 3 years
        fd.checkBalance();
        fd.maturityAmount();
    }
}
