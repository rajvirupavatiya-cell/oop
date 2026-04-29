// Class with synchronized method
class TablePrinter {

    // Synchronized method
    public synchronized void printTable(int num) {
        System.out.println("\nTable of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
            try {
                Thread.sleep(200); // delay for visibility
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

// Thread class
class MyThread extends Thread {
    private TablePrinter tp;
    private int number;

    public MyThread(TablePrinter tp, int number) {
        this.tp = tp;
        this.number = number;
    }

    public void run() {
        tp.printTable(number);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        TablePrinter tp = new TablePrinter();

        // Two threads with same object
        MyThread t1 = new MyThread(tp, 5);
        MyThread t2 = new MyThread(tp, 7);

        // Start threads
        t1.start();
        t2.start();
    }
}
