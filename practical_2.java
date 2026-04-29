import java.util.Scanner;

public class CramersRuleSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        System.out.print("Enter coefficient d: ");
        double d = scanner.nextDouble();

        System.out.print("Enter constant e: ");
        double e = scanner.nextDouble();

        System.out.print("Enter constant f: ");
        double f = scanner.nextDouble();

        // Calculate determinants
        double D = (a * d) - (b * c);
        double Dx = (e * d) - (b * f);
        double Dy = (a * f) - (e * c);

        // Check if solution exists
        if (D == 0) {
            System.out.println("No unique solution exists (D = 0).");
        } else {
            double x = Dx / D;
            double y = Dy / D;

            // Display results
            System.out.printf("Value of x = %.2f\n", x);
            System.out.printf("Value of y = %.2f\n", y);
        }

        scanner.close();
    }
}
