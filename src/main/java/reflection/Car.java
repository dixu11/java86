package reflection;

import java.io.Serializable;

@Nation
public final class Car implements Serializable,Comparable<Car> {


    private String name;
    private int mileage;

    public Car(String name, int mileage) {
        this.name = name;
        this.mileage = mileage;
    }


    public Car() {
        name = "Tesla";
        mileage = 10;
    }

    public void run(int distance) {
        mileage += distance;
        System.out.println("Jademy.");
    }

    public String getName() {
        return name;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }
}
