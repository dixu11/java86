package metody.rozwiazania;

import java.util.Random;

public class Zad24 {
    public static void main(String[] args) {
       int ulubiona =  dajUlubionaLiczbe();
        System.out.println("Twoja ulubiona liczba to : " + ulubiona);

       int suma =  dodajLiczby(1,2,3);
        System.out.println("Suma to: " + suma);

        int wynik = losujLiczbe();
        System.out.println("Wylosowałem: " + wynik);
    }

    static int dajUlubionaLiczbe(){
        return 25;
    }

    static int dodajLiczby(int a, int b, int c){
        return a + b + c;
    }

    static int losujLiczbe(){
        Random random = new Random();
        return random.nextInt(10)+1;
    }




//    metoda zwraca Twoją ulubioną liczbę. Przyjmij do zmiennej w main i wyświetl wartość zwróconą
//    metoda przyjmuje trzy liczby i zwraca ich sumę
//    metoda losuje liczbę od 1 do 10 i zwraca

}
