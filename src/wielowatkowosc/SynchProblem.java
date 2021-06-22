package wielowatkowosc;

public class SynchProblem {
    public static void main(String[] args) throws InterruptedException {
        Task2 task = new Task2();

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(task.getCounter());

    }
}


class Task2 implements Runnable {

    private int counter = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
           increment();
           // int newValue = counter + 1;
            //counter = newValue;
        }
    }

    public synchronized void increment() {
        counter++;
    }


    public int getCounter() {
        return counter;
    }
}
