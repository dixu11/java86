package podstawy.rozwiazania;

import java.util.Random;
import java.util.Scanner;

class Zad17 {
    public static void main(String[] args) {
        /*Zrób grę w zgadywanie, w której program losuje liczbę od 1 do 10,
            a gracz ma próbować ją odgadnąć. W przypadku każdej odpowiedzi gracz dostaje
        informację zwrotną: za wysoko/za nisko/trafiona.
                Jeśli zgadnie program ma zakończyć działanie i wyświetlić po
        ilu próbach udało mu się odgadnąć liczbę.*/

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int wylosowana = random.nextInt(10)  +1; // losuje
        System.out.println("wylosowano: " + wylosowana); // pomaga sobie podglądajac co wylosowałem
        int obstawiana; // aby mieć szerszy zakres dostępu do zmiennej
        int iloscObstawien = 0; // przygotowuję zmienna na ilosc wykonań pętli
        do{
            System.out.println("Zgadnij liczbę od 1 do 10!");
           obstawiana = scanner.nextInt(); // gracz wpisuje
            if (obstawiana < wylosowana){ // sprawdzam rózne warianty
                System.out.println("Za mało...");
            }else if(obstawiana> wylosowana){
                System.out.println("Za wysoko!");
            }
            iloscObstawien++; // zwiekszam o jeden za kazda probę
        }while (obstawiana != wylosowana);
        System.out.println("Zgadłeś!");
        System.out.println("Ilość prób: " + iloscObstawien);
    }
}
