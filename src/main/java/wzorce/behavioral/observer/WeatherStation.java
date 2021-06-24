package wzorce.behavioral.observer;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class WeatherStation implements Runnable {

    private Set<WeatherObserver> observers = new HashSet<>();


    public WeatherStation() {
       /* Thread thread = new Thread(() ->{
                while (true){
                    updateWeather();
                }
        });*/
        Thread thread = new Thread(this);
        thread.start();
    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void updateWeather() {
        Random random = new Random();
        double pressurehPa = random.nextInt(20) + 995;
        double temperatureCelsius = random.nextInt(41); //0-40
        double rainfallMm = random.nextDouble() * 10; // 0-10
        Weather weather = new Weather(temperatureCelsius, rainfallMm, pressurehPa);
        System.out.println("Aktualizacja pomiarów");
        for (WeatherObserver observer : observers) {
            observer.onNewWeather(weather);
        }
        try {
            Thread.sleep(random.nextInt(5_000) + 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (; ; ) { // nieskończona pętla
            updateWeather();
        }
    }
}
