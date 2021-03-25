package rozwiazania;

import java.util.Random;
import java.util.Scanner;

class Zad10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile ścianek ma mieć kostka?");
       int pobrana = scanner.nextInt();

       int wylosowana = random.nextInt(pobrana) +1;
        System.out.println("Wynik losowania: " + wylosowana);
        //6  -> 1-6
        //10 -> 1-10

        // jesli zakres wstawimy 5 to wylosuje 0 do 4


    }
}
