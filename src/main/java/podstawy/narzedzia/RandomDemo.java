package podstawy.narzedzia;

import java.util.Random;

class RandomDemo {

    public static void main(String[] args) {
        Random losownik = new Random();

//        System.out.println( losownik.nextInt(3)   );

        int wylosowana = losownik.nextInt(5);  // 0-4
        System.out.println("Wylosowano: " + wylosowana); // 1-5
        wylosowana = wylosowana +1;
        System.out.println("Poprawiony wynik losowania 1 do 5: " + wylosowana);


        System.out.println("Szybkim sposobem 3 do 12:");
        System.out.println(losownik.nextInt(10)+3);  // zakres 3 do 12

        int kostaWynik = losownik.nextInt(6)+1;
        System.out.println("Na kostce wypadło: " + kostaWynik);

        //losowanie double daje 0.0 do 1.0
        System.out.println(losownik.nextDouble());

        System.out.println(losownik.nextBoolean());




    }

}
