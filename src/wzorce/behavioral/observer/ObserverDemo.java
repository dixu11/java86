package wzorce.behavioral.observer;

class ObserverDemo {
    /*
     * Zaimplementować klasę reprezentującą stację pogodową
     * - robi pomiary temperatury oraz opadów w losowych momentach
     *
     *
     * */
    public static void main(String[] args) {
        WeatherForecaster forecaster = new WeatherForecaster();
        WeatherDisplay display = new WeatherDisplay();
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(forecaster);
        weatherStation.addObserver(display);
    }
}
