package obiektowe.wstep;

import java.util.Random;
import java.util.Scanner;

public class ObiektoweWstep {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String zdanie = new String("Ala ma kota");
        int[] liczby = new int[]{23, 56, 67, 23};

      // MojaKlasa mojObiekt1 = new MojaKlasa();
        Osoba osoba1 = new Osoba("Radek", 18);
        Osoba osoba2 = new Osoba("Marcin", 30);

//        Osoba.imie  // tak dostałbym się tylko do statycznej składowej

//        osoba1.nazwa = "Radek";
//        osoba2.nazwa = "Marcin";

//        System.out.println(osoba1.nazwa);
//        System.out.println(osoba2.nazwa);

     //   osoba1.wiek = 30;

//        System.out.println(osoba1.wiek);
//        System.out.println(osoba2.wiek);

       // Osoba.wyswietlDane();

//        osoba1.wyswietlDane();
//        osoba2.wyswietlDane();
        System.out.println(osoba1);
        System.out.println(osoba2);

        osoba1.wyprawUrodziny();
        osoba1.wyswietlDane();

        osoba2.dodajNazwisko("Kowalski");
        if (osoba2.czyPelnoletni()) {
            System.out.println(osoba2.getNazwa() + " jest pełnoletni");
        }

    }
}
