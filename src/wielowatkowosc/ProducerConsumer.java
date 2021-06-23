package wielowatkowosc;

public class ProducerConsumer {


    public static void main(String[] args) {
        Work work = new Work();
        work.produce();
        work.produce();
        System.out.println(work.getProducts());
        work.consumeLetter();
        work.start();
    }




}



