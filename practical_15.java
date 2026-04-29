// Base class
class Employee {
    String name = "Raj";
    String department = "IT";

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

// Subclass
class Manager extends Employee {
    int teamSize = 10;
    String projectName = "AI Project";

    // Overriding method
    @Override
    public void displayDetails() {
        // Call base class method (optional)
        super.displayDetails();

        // Add manager-specific details
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Base class object
        Employee emp = new Employee();
        System.out.println("Employee Details:");
        emp.displayDetails();

        System.out.println("\n---------------------\n");

        // Subclass object
        Manager mgr = new Manager();
        System.out.println("Manager Details:");
        mgr.displayDetails();

        System.out.println("\n---------------------\n");

        // Runtime polymorphism (base reference, subclass object)
        Employee ref = new Manager();
        System.out.println("Using Base Reference (Runtime Polymorphism):");
        ref.displayDetails(); // calls Manager's version
    }
}
