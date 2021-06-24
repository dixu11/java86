package java8;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {


       // System.out.println(myFunction.doStuff("sdsdfsdfsdf"));

        metodaPrzyjmeMetode((String text) -> {
           return text.substring(0, 3).toLowerCase();
        });


//        Consumer - coś przyjmuje nic nie zwraca np: void(int)
//        Supplier - nic nie przyjmuje ale coś zwraca np: int()
//        Function - coś przyjmuje coś zwraca np: String(int)
//        Predicate - coś przyjmuje i zwraca boolean np: boolean(Person)
//        Runnable - nic nie przyjmuje nic nie zwraca: void()
//        Operator - coś przyjmuje i zwraca coś TEGO SAMEGO TYPU String(String)
//        Comparator - przyjmuje dwa argumenty i zwaraca int int(Person,Person)

        List<Integer> numbers = List.of(345, 455, 34, 232, 345, 56, 563, 23);
        Integer counter = 0;
        IntHolder holder = new IntHolder(); // trik na obiejście problemu braku mozliwosci przestawienia zmiennej w lambda
      /*  for (Integer number : numbers) {
            System.out.println(number);
            if (number > 100) {
                counter++;
            }
        }*/
      //  counter++;
        System.out.println("ile liczb: " + counter);
        numbers.forEach( number  -> {
            System.out.println(counter);
            System.out.println(number);
            if (number > 100) {
                holder.counter++;
            }
        });

    }

    public static void metodaPrzyjmeMetode(Function function) {
        System.out.println("Wywolam wiele razy Twoja metode:");
        System.out.println(function.doStuff("sdsdfsdfsdf"));
        System.out.println(function.doStuff("sdsdfsdfsdf"));
    }


}

@FunctionalInterface
interface Function {
    String doStuff(String text);
}


class IntHolder{

    int counter = 0;

}
