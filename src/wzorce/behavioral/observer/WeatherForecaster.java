package wzorce.behavioral.observer;

import java.util.Random;

class WeatherForecaster implements WeatherObserver{
    @Override
    public void onNewWeather(Weather weather) {
        predictWeather(weather);
    }

    public void predictWeather(Weather weather){
        Random random = new Random();
      double  temperatureCelsius = random.nextInt(3) + weather.getTemperatureCelsius();
      double  rainfallMm = weather.getRainfallMm()- random.nextDouble();
        System.out.printf("Jutro będzie %.2fC i %.2fmm/m2 opadów :) \n",temperatureCelsius,rainfallMm);
    }
}
