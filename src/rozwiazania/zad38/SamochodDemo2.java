package rozwiazania.zad38;

import rozwiazania.zad34.Samochod;

import java.util.Scanner;

public class SamochodDemo2 {
    /*
    * W tym zadaniu wykorzystaj wcześniej przygotowaną klasę
    *  Samochod. zaprogramuj aplikację pytającą o model
    * Twojego samochodu oraz przebieg. Możesz zrobić to w
    *  metodzie main. Aplikacja ta ma stworzyć obiekt
    * samochód i sprawdzić czy dany samochód powinien
    * zrobić przegląd czy nie. Jeśli tak, powinna wyświetlić
    *  “samochód o marce … powinien zrobić przegląd już …
    *  kilometrów temu!”, a jeśli wszystko jest okej może
    * wyświetlić “Dla samochodu o marce … zostało jeszcze …
    * kilometrów do przeglądu”.

     * */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaka marka?");
        String marka = scanner.nextLine();

        System.out.println("Jaki przebieg?");
        int przebieg = scanner.nextInt();

        Samochod samochod = new Samochod(marka, przebieg);
        System.out.println("Przygotowany obiekt:");
        System.out.println(samochod);

        int odloscDoPrzegladu = samochod.ileDoPrzegladu();
        System.out.println(odloscDoPrzegladu);

        if (odloscDoPrzegladu > 0) {
            System.out.println("Przegląd dla samochudu marki: " + samochod.marka +
                    " nalezy zrobić za " + odloscDoPrzegladu + " km");
        } else {
            System.out.println("Trzeba było zrobić " + Math.abs(odloscDoPrzegladu) + " km temu!!");
        }
    }
}
