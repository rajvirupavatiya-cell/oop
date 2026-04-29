public class Rectangle {
    // Data fields
    double width = 1;
    double height = 1;

    // No-argument constructor
    public Rectangle() {
        // default values already set (1,1)
    }

    // Parameterized constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    public double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Optional: main method to test the class
    public static void main(String[] args) {
        // Using default constructor
        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle 1:");
        System.out.println("Width = " + r1.width + ", Height = " + r1.height);
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());

        // Using parameterized constructor
        Rectangle r2 = new Rectangle(5, 3);
        System.out.println("\nRectangle 2:");
        System.out.println("Width = " + r2.width + ", Height = " + r2.height);
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());
    }
}
