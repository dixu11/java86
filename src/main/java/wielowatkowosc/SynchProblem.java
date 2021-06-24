package wielowatkowosc;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

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
        System.out.println(task.getCounterAtomic());

    }
}


class Task2 implements Runnable {

     private int counter = 0; // na zwykłym int
    private AtomicInteger counterAtomic = new AtomicInteger(0); // atomowa wersja

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            increment();
            counterAtomic.incrementAndGet();
            // int newValue = counter + 1;
            //counter = newValue;

            synchronized (this) { //this -> obiekt pilnujący zakresu (przekazujacy klucz)
                counter++;
            }
        }
    }

    public synchronized void increment() {
        counter++;
    }


    public int getCounter() {
        return counter;
    }

    public int getCounterAtomic() {
        return counterAtomic.get();
    }
}
