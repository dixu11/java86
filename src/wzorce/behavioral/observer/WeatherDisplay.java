package wzorce.behavioral.observer;

class WeatherDisplay implements WeatherObserver {
    //Weather Station station;


    @Override
    public void onNewWeather(Weather weather) {
        showActualWeather(weather);
    }

    public void showActualWeather(Weather weather) {
         System.out.printf("Temperatura: %.2fC opady: %.2fmm/m2 ciśnienie: %.2f hPa\n"
                 , weather.getTemperatureCelsius(),weather.getRainfallMm(),weather.getPressurehPa());
    }
}
