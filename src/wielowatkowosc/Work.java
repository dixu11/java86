package wielowatkowosc;

import java.util.*;

public class Work {

    private Random random = new Random();
    private Queue<String> products = new LinkedList<>();
    private int limit = 5;

    private Thread producer;
    private Thread consumer;

    public Work() {
        Runnable task1 = ()-> {
            while (true){
                produce();
            }
        };

        Runnable task2 = ()-> {
            while (true){
                consumeLetter();
            }
        };

        producer = new Thread(task1);
        consumer = new Thread(task2);
    }

    public void start() {
        producer.start();
        consumer.start();
    }

    public void produce() {
        String abcd = "abcd";
        products.add(abcd.charAt(random.nextInt(abcd.length())) + "");
        synchronized (consumer){
            consumer.notify(); // obudz konsumera
        }
        System.out.println("Letter produced! we have " + products.size() + " letters");
        sleepForRandomTime();
        if (products.size() == 5) {
            try {
                synchronized (producer){
                    producer.wait(); // czekaj bo jest full
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void consumeLetter() {
        String letter = products.remove();
        synchronized (producer){
            producer.notify(); // jest miejsce, wstawaj i dodawaj!
        }
        if (products.size() == 0) {
            try {
                synchronized (consumer){
                    consumer.wait(); // czekam bo nie ma co konsumować
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Your letter is: " + letter);
        sleepForRandomTime();
    }

    public void sleepForRandomTime() {
        try {
            Thread.sleep(random.nextInt(1000)+500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public Queue<String> getProducts() {
        return products;
    }


}
