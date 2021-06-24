package wielowatkowosc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ProducerConsumerAutomat {
    private Random random = new Random();
    private int limit = 5;
    private BlockingQueue<String> products = new LinkedBlockingQueue<>(limit);

    private Thread producer;
    private Thread consumer;

    public ProducerConsumerAutomat() {
        Runnable task1 = ()-> {
            while (true){
                try {
                    produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable task2 = ()-> {
            while (true){
                try {
                    consumeLetter();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        producer = new Thread(task1);
        consumer = new Thread(task2);
    }

    public void start() {
        producer.start();
        consumer.start();
    }

    public void produce() throws InterruptedException {
        String abcd = "abcd";
        products.offer(abcd.charAt(random.nextInt(abcd.length())) + "",1000, TimeUnit.DAYS);
        System.out.println("Letter produced! we have " + products.size() + " letters");
        sleepForRandomTime();
    }


    public void consumeLetter() throws InterruptedException {
        String letter = products.take();
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

    public static void main(String[] args) {
        ProducerConsumerAutomat automat = new ProducerConsumerAutomat();
        automat.start();
    }


}
