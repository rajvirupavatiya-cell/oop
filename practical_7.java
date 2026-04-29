import java.util.Scanner;

public class Employee {
    // Private instance variables
    private String employeeName;
    private double employeeSalary;

    // Method to read employee data
    public void readEmployeeData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        employeeName = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        employeeSalary = scanner.nextDouble();
    }

    // Method to display employee data
    public void displayEmployeeData() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }

    // Main method to demonstrate object creation
    public static void main(String[] args) {
        // Create object
        Employee emp = new Employee();

        // Call methods
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}
