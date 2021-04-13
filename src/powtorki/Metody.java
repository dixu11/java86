package powtorki;

import java.util.Random;

class Metody {


    public static void main(String[] args) {
        sayHelloTo("Zofia");
        sayHelloTo("Ada");
        sayHelloTo("Marian","Adam",3);

        greet();

        Random random = new Random();
        int generatedNumber = random.nextInt(5);
        System.out.println(generatedNumber);

        int lucky = getLuckyNumber() + 3;
        System.out.println(lucky);

        System.out.println(add(2,2));


    }

    //nagłówek / sygnatura
    //ciało / {}

    //sygnatura:


    //  |modyfikator dostępu| obiektowe/nieobiektowe | typ zwracany | nazwa | ( parametry )

    public static void greet ( )  {
        System.out.println("Hello");

    }

    public static void sayHelloTo( String name){
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




}
