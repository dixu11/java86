package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;

public class RefleksjaDemo {

    public static void main(String[] args)
            throws ClassNotFoundException,
            NoSuchMethodException,
            InvocationTargetException,
            IllegalAccessException,
            InstantiationException,
            NoSuchFieldException {


        Car car = new Car();

        Class klasaCar3 = Car.class;  // przez typ
        Class klasaCar2 = car.getClass();  // przez obiekt
        Class klasaCar = Class.forName("reflection.Car"); // przez pełną nazwę klasy w Stringu


        Class[] interfaces = klasaCar.getInterfaces();

        int modifiers = klasaCar.getModifiers();
        System.out.println(Modifier.toString(modifiers));


        Method[] methods = klasaCar.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getReturnType());
            System.out.println(Arrays.toString(method.getParameters()));
        }

        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Method method = klasaCar.getMethod("run", int.class);
        method.invoke(car, 10);
        car.run(10);
        System.out.println(car);

//można parametryzować: <Car>
        Constructor carConstructor = klasaCar.getConstructor(String.class, int.class);
//        Car car2 = new Car("Fiat", 23345);
        Car car2 = (Car) carConstructor.newInstance("Fiat", 21334);
        System.out.println(car2);

        //getDeclaredField - zwroci rowniez prywatne pola
        Field field = klasaCar.getDeclaredField("mileage");
       // car2.mileage = 0;
        field.setAccessible(true);
        field.set(car2,0);
        System.out.println(car2);


        Annotation annotation = klasaCar.getAnnotation(Nation.class);
        System.out.println(annotation);


    }


}
