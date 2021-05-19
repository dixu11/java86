package wzorce.behavioral.observer;

import java.util.Objects;

class Weather {
    //celsius
    private final double temperatureCelsius;
    //mm/m2
    private final double rainfallMm;
    //pressure
    private final double pressurehPa;

    Weather(double temperatureCelsius, double rainfallMm, double pressurehPa) {
        this.temperatureCelsius = temperatureCelsius;
        this.rainfallMm = rainfallMm;
        this.pressurehPa = pressurehPa;
    }

    double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    double getRainfallMm() {
        return rainfallMm;
    }

    double getPressurehPa() {
        return pressurehPa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weather weather = (Weather) o;
        return Double.compare(weather.temperatureCelsius, temperatureCelsius) == 0 && Double.compare(weather.rainfallMm, rainfallMm) == 0 && Double.compare(weather.pressurehPa, pressurehPa) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperatureCelsius, rainfallMm, pressurehPa);
    }

    @Override
    public String toString() {
        return "Weather{" +
                "temperatureCelsius=" + temperatureCelsius +
                ", rainfallMm=" + rainfallMm +
                ", pressurehPa=" + pressurehPa +
                '}';
    }
}
