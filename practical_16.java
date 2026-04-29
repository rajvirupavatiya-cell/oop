// Define interface
interface Classify {
    String getDivision(double average);
}

// Implementing class
class Result implements Classify {

    // Implement method
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "Other Division";
        }
    }

    // Main method
    public static void main(String[] args) {
        Result r = new Result();

        double avg1 = 72.5;
        double avg2 = 55.0;

        System.out.println("Average: " + avg1 + " -> " + r.getDivision(avg1));
        System.out.println("Average: " + avg2 + " -> " + r.getDivision(avg2));
    }
}
