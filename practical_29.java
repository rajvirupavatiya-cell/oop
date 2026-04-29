import java.util.ArrayList;
import java.util.Collections;

public class StudentMarks {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> marks = new ArrayList<>();

        // Add at least 5 marks
        marks.add(75);
        marks.add(88);
        marks.add(92);
        marks.add(67);
        marks.add(81);

        // Display all marks
        System.out.println("Student Marks:");
        for (int m : marks) {
            System.out.println(m);
        }

        // Find highest and lowest marks
        int maxMarks = Collections.max(marks);
        int minMarks = Collections.min(marks);

        // Display results
        System.out.println("\nHighest Marks: " + maxMarks);
        System.out.println("Lowest Marks: " + minMarks);
    }
}
