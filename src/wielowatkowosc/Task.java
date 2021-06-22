package wielowatkowosc;

public class Task implements Runnable{

    private boolean running = true;


    @Override
    public void run() {
        for (int i = 0; i < 10_000; i++) {
            System.out.println("Hello from other thread!");
            if (!running) {
                System.out.println("WATEK PRZERWANY!!! po " + i + " wykonanaich");
                return;
            }

            if (Thread.currentThread().isInterrupted()) { // inny sposob - sprawdzic czy biewrzacy watek zostal przerwany za pomoca metody interupt
                System.out.println("WATEK PRZERWANY!!! po " + i + " wykonanaich");
                return;
            }
        }
    }


    public void setRunning(boolean running) {
        this.running = running;
    }
}
