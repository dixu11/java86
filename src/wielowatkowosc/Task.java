package wielowatkowosc;

public class Task implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from other thread!");
        }
    }
}
