package rozwiazania.wielowatkowosc;

public class ConcatenationTask implements Runnable {

    private String text;
    private int count;
    private Thread thread;
    private String result = "";
    private boolean running = true;

    public ConcatenationTask(String text, int count) {
        this.text = text;
        this.count = count;
        thread = new Thread(this);
    }

    public void startTask() {
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            result += text;
            if (!running) {
                System.out.println("Przerwany!");
                return;
            }
        }
    }

    public String getResult() {
        return result;
    }

    public void waitForTask() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void abort() {
        running = false;
    }
}
