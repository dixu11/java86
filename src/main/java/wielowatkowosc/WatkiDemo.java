package wielowatkowosc;

public class WatkiDemo {
    public static void main(String[] args) throws InterruptedException{
       /* Runnable runnable = new Task();
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Old boring main thread...");
        }*/


        // Runnable runnable = new Task();

    /*    Runnable runnable = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Hello from other thread!");
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Old boring main thread...");
        }*/


       /* Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Hello from other thread!");
            }
        });
        thread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Old boring main thread...");
        }


        thread.join();
        System.out.println("KONIEC PROGRAMU");*/



        // aborting thread example
          Task runnable = new Task();
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Old boring main thread...");
        }
        //runnable.setRunning(false);
        thread.interrupt();


    }
}
