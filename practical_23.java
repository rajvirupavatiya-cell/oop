// Thread 1: prints 1 to 10 every 1 second
class ThreadOne extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(1000); // 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread 1 interrupted");
            }
        }
    }
}

// Thread 2: prints 11 to 20 every 500 ms
class ThreadTwo extends Thread {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(500); // 0.5 second
            } catch (InterruptedException e) {
                System.out.println("Thread 2 interrupted");
            }
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Create thread objects
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        // Start threads
        t1.start();
        t2.start();
    }
}
