package rozwiazania;

import java.util.Random;

public class Zad24 {
    public static void main(String[] args) {
        int ulubiona = dajUlubionaLiczbe();
        System.out.println("Twoja ulubiona liczba to : " + ulubiona);

        int suma = dodajLiczby(1, 2, 3);
        System.out.println("Suma to: " + suma);

        int wynik = losujLiczbe();
        System.out.println("Wylosowałem: " + wynik);


        System.out.println("Ilość lat: " + nieLiczeGodzinILat(3));
        System.out.println(podziel(3, 7));
        System.out.println(podziel(3, 0));

       String data = formatujDate(11,3,1990);
        System.out.println(data);

        int[] przykladoweLiczby = {23, 56, 67, 23};
        int sumaZTablicy = dodajLiczby(przykladoweLiczby);
        System.out.println("Suma liczb z tablicy wynosi: " + sumaZTablicy);
    }

    static int dajUlubionaLiczbe() {
        return 25;
    }

    static int dodajLiczby(int a, int b, int c) {
        return a + b + c;
    }

    static int losujLiczbe() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }


//    metoda zwraca Twoją ulubioną liczbę. Przyjmij do zmiennej w main i wyświetl wartość zwróconą
//    metoda przyjmuje trzy liczby i zwraca ich sumę
//    metoda losuje liczbę od 1 do 10 i zwraca

//metoda przyjmuje ilość lat i zwraca ilość dni

    static double nieLiczeGodzinILat(int lata) {    // przelicza lata na dni
        return lata * 365.24;
    }

    //    metoda przyjmuje dwie liczby i dzieli pierwszą przez drugą. Jeśli druga liczba to 0 metoda ma zwrócić -1 aby zakomunikować błąd.
    static double podziel(double liczba1, double liczba2) {
        if (liczba2 == 0) {
            return -1;
        }
        return liczba1 / liczba2;
    }

//    metoda przyjmuje dzień, miesiąc i rok urodzenia i zwraca je w postaci String formatując w ten sposób: “RRRR-MM-DD”
    static String formatujDate(int dzien, int miesiac, int rok){
        String miesiacTekst = "";
        if (miesiac < 10) { // dodaje 0 jeśli mniejsza niż 10
            miesiacTekst += "0";
        }
        miesiacTekst += miesiac;
        //tak samo przydałoby się z dniem

        return   rok +"-" + miesiacTekst + "-" + dzien;
    }

//    metoda przyjmuje trzy liczby, zwraca true jeśli wszystkie trzy liczby są identyczne, wykorzystaj metodę wywołując ją w miejscu na warunek ifa w mainie

    static int dodajLiczby(int[] liczby) {
        int suma = 0;
        for(int liczba: liczby){
            suma += liczba;
        }
        return suma;
    }

//    metoda przyjmuje tablicę liczb i zwraca ich sumę


//    metoda przyjmuje tablicę liczb oraz liczbę całkowitą, zwraca true jeśli w tablicy istnieje liczba większa od przekazanej, false jeśli nie
//
//    wariant trudniejszy: metoda przyjmuje liczbę całkowitą. Powinna zwrócić tablicę liczb pierwszych nie większych niż przekazana liczba.

}
