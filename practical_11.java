import java.util.Scanner;

public class College {
    // Outer class data member
    private String collegeName;

    // Constructor to initialize college name
    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    // Non-static inner class
    class Admission {
        private String studentName;
        private String course;

        // Method to accept student details
        public void acceptDetails() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter student name: ");
            studentName = scanner.nextLine();

            System.out.print("Enter course: ");
            course = scanner.nextLine();
        }

        // Method to display details
        public void displayDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName); // accessing outer class variable
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create outer class object
        System.out.print("Enter college name: ");
        String cname = scanner.nextLine();
        College college = new College(cname);

        // Create inner class object
        College.Admission admission = college.new Admission();

        // Accept and display details
        admission.acceptDetails();
        admission.displayDetails();

        scanner.close();
    }
}
