public class VolumeCalculator {

    // Volume of Cube (side^3)
    public double calculateVolume(double side) {
        return side * side * side;
    }

    // Volume of Rectangular Cube (l × w × h)
    public double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Volume of Sphere ((4/3) × π × r^3)
    public double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    // Main method to test overloading
    public static void main(String[] args) {
        VolumeCalculator vc = new VolumeCalculator();

        // Cube
        double cubeVolume = vc.calculateVolume(3);
        System.out.printf("Volume of Cube: %.2f\n", cubeVolume);

        // Rectangular Cube
        double rectVolume = vc.calculateVolume(4, 5, 6);
        System.out.printf("Volume of Rectangular Cube: %.2f\n", rectVolume);

        // Sphere
        double sphereVolume = vc.calculateVolume(2.5f);
        System.out.printf("Volume of Sphere: %.2f\n", sphereVolume);
    }
}
