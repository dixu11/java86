package metody;

import java.util.Random;
import java.util.Scanner;

public class MetodyArgumenty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int wylosowana = random.nextInt(5);
        System.out.println("Losowa liczba z zakresu 0-4");
        System.out.println(wylosowana);

        String imieGracza = "Zenon";
        hello(5,10);
        przywitaj(imieGracza);
        przywitaj("Marta");

        dodajLiczby(2,2);

        int[] liczby = {23, 45, 567};

        wyswietlPierwszaLiczbe(liczby);
    }

    public static void wyswietlPierwszaLiczbe( int[] tablica ){
        System.out.println("Pierwsza liczba z tablicy to: " + tablica[0]);
    }





    public static void hello(int liczba, int liczba2){
        System.out.println("hello");
        System.out.println("Metoda otrzymała liczby:");
        System.out.println(liczba);
        System.out.println(liczba2);
    }

    public static void przywitaj(String imie){
        System.out.println("Cześć " + imie);
    }

    public static void dodajLiczby(int liczba1, int liczba2){
        System.out.println("Wynik to:");
        System.out.println(liczba1 + liczba2);
    }



}
