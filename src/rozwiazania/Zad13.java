package rozwiazania;

import java.util.Random;
import java.util.Scanner;

class Zad13 {
    public static void main(String[] args) {
       /*
       Przygotuj program, który będzie symulował przejazd autobusem.
        Program ma pytać ile przystanków masz zamiar przejechać oraz czy kasujesz bilet.
        Zadeklaruj zmienną double z procentową szansą na to,
        że jadąc jeden przystanek trafisz na kontrolera i dostaniesz karę.
                Wykonaj losowanie i wyświetl czy użytkownikowi
        udało się tym razem uniknąć kary czy nie :)
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile przystanków chcesz przejechać?");
        int przystanki = scanner.nextInt();

        System.out.println("Kasujesz bilet ? wpisz 'true' lub 'false'");
        boolean kasujemy = scanner.nextBoolean();

        double ryzykoKary = 0.2*przystanki; // 20%
        Random random = new Random();


        if(kasujemy){
            System.out.println("Nie musisz bać się kontroli :)");
            System.exit(0);
        }

        double wynikLosowania= random.nextDouble();   //0 do 1.0
        System.out.println("Wylosowane: " + wynikLosowania);

        if (wynikLosowania > ryzykoKary) {
            System.out.println("Masz szczęscie, nie trafiłeś na kanara");
        }else{
            System.out.println("Kontrola! Dostajesz karę");
        }


    }
}
