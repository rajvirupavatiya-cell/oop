// Interface 1
interface Exam {
    boolean isPassed(int mark);
}

// Interface 2
interface Classify {
    String getDivision(double average);
}

// Class implementing both interfaces
class Result implements Exam, Classify {

    // Implementation of isPassed()
    public boolean isPassed(int mark) {
        return mark >= 40; // pass if marks >= 40
    }

    // Implementation of getDivision()
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }

    // Main method
    public static void main(String[] args) {
        Result r = new Result();

        int mark = 55;
        double average = 58.5;

        // Using Exam interface method
        if (r.isPassed(mark)) {
            System.out.println("Student Passed with marks: " + mark);
        } else {
            System.out.println("Student Failed with marks: " + mark);
        }

        // Using Classify interface method
        System.out.println("Division: " + r.getDivision(average));
    }
}
