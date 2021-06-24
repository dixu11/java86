package rozwiazania;

import java.util.Scanner;

public class Zad21 {

    public static void main(String[] args) {
//        Napisz program, który zapyta użytkownika ile notatek potrzebuje i stworzy tablicę tekstów o
//        wpisanej wielkości. Następnie stwórz pętlę, która pozwoli wprowadzać notatki tyle razy ile
//        jest miejsc w tablicy i wyświetl wszystkie pozycje tablicy.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile notatek potrzebujesz?");
        int iloscNotatek = scanner.nextInt();
        scanner.nextLine(); //czyszzenie scannera
        String[] notatki = new String[iloscNotatek]; // wielkosc tablicy taka jak wpisano

        for (int i = 0; i < notatki.length; i++) {
            System.out.println("Podaj notatkę:");
            String notatka = scanner.nextLine();
            notatki[i] = notatka;  // zapisywanie notatki na kolejne pozycje 0..1...2...
        }

        System.out.println("Twoje notatki to: ");
        for (int i = 0; i < notatki.length; i++) {
            System.out.println(notatki[i]);
        }
    }


}
