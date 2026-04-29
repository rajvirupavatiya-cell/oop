import java.io.*;

public class StudentFileDemo {
    public static void main(String[] args) {

        FileWriter fw = null;
        BufferedWriter bw = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Writing to file
            fw = new FileWriter("students.txt");
            bw = new BufferedWriter(fw);

            bw.write("101 Raj 85\n");
            bw.write("102 Priya 90\n");
            bw.write("103 Amit 78\n");

            System.out.println("Student records written to file.");

            bw.close(); // close writer before reading

            // Reading from file
            fr = new FileReader("students.txt");
            br = new BufferedReader(fr);

            String line;
            System.out.println("\nReading student records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                // Close resources safely
                if (bw != null) bw.close();
                if (fw != null) fw.close();
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }

            System.out.println("\nFile operation completed.");
        }
    }
}
