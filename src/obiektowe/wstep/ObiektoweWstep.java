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
        Osoba osoba1 = new Osoba();
        Osoba osoba2 = new Osoba();

//        Osoba.imie  // tak dostałbym się tylko do statycznej składowej

        osoba1.imie = "Radek";
        osoba2.imie = "Marcin";

        System.out.println(osoba1.imie);
        System.out.println(osoba2.imie);

    }
}
