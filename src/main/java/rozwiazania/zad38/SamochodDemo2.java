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
        SamochodSerwis serwis = new SamochodSerwis();
      Samochod s =  serwis.zbudujSamochod();
        serwis.sprawdzPrzeglady(s);
    }
}
