package rozwiazania;

import java.util.Arrays;
import java.util.Scanner;

public class Zad27 {

  /*  Wykonaj następujące zadania:
    Wyświetl piątą potęgę liczby 2 wykorzystując bibliotekę Math.
    stwórz metodę która przyjmie tekst i zwróci true jeśli ostatni znak będzie cyfrą.
        Przykładowo “ul. Wiejska 1” -> true


    napisz metodę, w której za pomocą scannera pobierzesz liczbę i ją zwrócisz. Metoda ma zwracać -1 jeśli
    poda się tekst.
    wariant trudniejszy: jeśli poda się litery metoda ma pozwolić na powtórne wprowadzanie danych do skutku.

    napisz metodę, która wyszukuje element i zwraca jego pozycję. Wykorzystaj algorytm sortowania binarnego
    zaimlementowany w bibliotece Arrays.
    Metoda ma najpierw posortować przyjęty zbiór.*/


    public static void main(String[] args) {
        /*System.out.println(Math.pow(2, 5));
        System.out.println(czyOstatniJestCyfra("ul. Wiejska 1"));
        int wynik = pobierzLiczbe();
        System.out.println("Podałeś: " + wynik);*/
        //mojaMetodaRekurencyjna();
//        rekurencjaLiczenie(0);
//        ograniczonaRekurencja(0);
        int pobrana = pobierzLiczbeRekurencyjnie();
        System.out.println("Pobrana to: " + pobrana);

        int[] liczby = {123, 45, 5, 768, 324, 2};
        System.out.println(znajdzElement(liczby, 2));

    }

    private static boolean czyOstatniJestCyfra(String tekst) {
        char ostatniZnak = tekst.charAt(tekst.length() - 1);
        return Character.isDigit(ostatniZnak);
    }

    private static int pobierzLiczbe() {
        Scanner scanner = new Scanner(System.in);
        String liczbaJakoTekst;
        boolean znalazloLitery;
        do {
            znalazloLitery = false;
            System.out.println("Podaj liczbę: ");
            liczbaJakoTekst = scanner.nextLine();
            for (int i = 0; i < liczbaJakoTekst.length(); i++) {
                char znak = liczbaJakoTekst.charAt(i);
                if (!Character.isDigit(znak)) {
                    znalazloLitery = true;
                }
            }
        } while (znalazloLitery);
        return Integer.parseInt(liczbaJakoTekst);
    }

    private static void mojaMetodaRekurencyjna() {
        System.out.println("hello");
        int liczba = 10;
        mojaMetodaRekurencyjna(); // metoda wywołuje samą siebie
        System.out.println("Moja liczba: " + liczba);
    }

    private static void rekurencjaLiczenie(int licznik) {
        licznik++;
        System.out.println(licznik);
        rekurencjaLiczenie(licznik);
    }

    private static void ograniczonaRekurencja(int licznik) {
        licznik++;
        System.out.println(licznik);
        if (licznik == 5000) {
            System.out.println("KONIEC");
            return;
        }
        ograniczonaRekurencja(licznik);
    }

    private static int pobierzLiczbeRekurencyjnie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        String liczbaJakoTekst = scanner.nextLine();
        for (int i = 0; i < liczbaJakoTekst.length(); i++) {
            char znak = liczbaJakoTekst.charAt(i);
            if (!Character.isDigit(znak)) {
             return pobierzLiczbeRekurencyjnie();
            }
        }
        return Integer.parseInt(liczbaJakoTekst);
    }


    private static int znajdzElement(int[] liczby, int element) {
        Arrays.sort(liczby);
        return Arrays.binarySearch(liczby, element);
    }


//    napisz metodę, która wyszukuje element i zwraca jego pozycję. Wykorzystaj algorytm sortowania binarnego
//    zaimlementowany w bibliotece Arrays.

}
// do klasycznego for skrót: fori
//do for-each: iter