// Abstract class
abstract class Vehicle {

    // Abstract methods
    abstract String fuelType();
    abstract int noOfWheels();
}

// Subclass: Car
class Car extends Vehicle {

    public String fuelType() {
        return "Petrol/Diesel";
    }

    public int noOfWheels() {
        return 4;
    }
}

// Subclass: Bike
class Bike extends Vehicle {

    public String fuelType() {
        return "Petrol";
    }

    public int noOfWheels() {
        return 2;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Create Car object
        Vehicle car = new Car();
        System.out.println("Car Details:");
        System.out.println("Fuel Type: " + car.fuelType());
        System.out.println("Number of Wheels: " + car.noOfWheels());

        System.out.println("\n----------------------\n");

        // Create Bike object
        Vehicle bike = new Bike();
        System.out.println("Bike Details:");
        System.out.println("Fuel Type: " + bike.fuelType());
        System.out.println("Number of Wheels: " + bike.noOfWheels());
    }
}
