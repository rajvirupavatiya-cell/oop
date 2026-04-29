// Thread to print a range of numbers
class NumberThread extends Thread {
    private int start, end;

    public NumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread(1, 100);
        NumberThread t2 = new NumberThread(101, 200);
        NumberThread t3 = new NumberThread(201, 300);

        try {
            // Start T1 and wait for it to finish
            t1.start();
            t1.join();

            // Start T2 and wait for it to finish
            t2.start();
            t2.join();

            // Start T3
            t3.start();
            t3.join();

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
