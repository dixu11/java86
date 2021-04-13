package powtorki;

import java.util.Random;

class Metody {


    public static void main(String[] args) {
        //args
        sayHelloTo("Zofia");
        sayHelloTo("Ada");
        sayHelloTo("Marian", "Adam", 3);
        greet();

        Random random = new Random();

        //return values
        int generatedNumber = random.nextInt(5);
        System.out.println(generatedNumber);

        int lucky = getLuckyNumber() + 3;
        System.out.println(lucky);

        System.out.println(add(2, 2));

        int result = countPower(3);
        System.out.println(result);

        //recursion
        System.out.println(countPowerRecursion(3));

        //varargs
        showNumbers(1);
        showNumbers(1, 45, 67);
        showNumbers();
        showNumbers(456, 56, 676, 76, 787, 878, 67, 5645, 343, 2, 323, 12, 12, 34, 4, 5, 67, 8);
    }

    //nagłówek / sygnatura
    //ciało / {}

    //sygnatura:


    //  |modyfikator dostępu| obiektowe/nieobiektowe | typ zwracany | nazwa | ( parametry )

    public static void greet() {
        System.out.println("Hello");

    }

    public static void sayHelloTo(String name) {
        System.out.println("Hi " + name);
    }

    public static void sayHelloTo(String name1, String name2, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hi to: " + name1 + " " + name2);
        }
    }

    public static int getLuckyNumber() {
        return 7;
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }


    // 2 -> 4 // 3 -> 8 // 4 -> 16 ....
    public static int countPower(int power) {
        int result = 2;
        for (int i = 1; i < power; i++) {
            result *= 2;
        }
        return result;
    }

    public static int countPowerRecursion(int power) {
        if (power == 0) {
            return 1;
        }
        return countPowerRecursion(power - 1) * 2;
    }


    public static void showNumbers(int... numbers) { // varargs - dowolna ilość argumentów
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }

}
