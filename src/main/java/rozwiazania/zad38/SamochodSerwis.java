package rozwiazania.zad38;

import rozwiazania.zad34.Samochod;

import java.util.Scanner;

public class SamochodSerwis {

    public Samochod zbudujSamochod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaka marka?");
        String marka = scanner.nextLine();

        System.out.println("Jaki przebieg?");
        int przebieg = scanner.nextInt();

        Samochod samochod = new Samochod(marka, przebieg);
        System.out.println("Przygotowany obiekt:");
        System.out.println(samochod);
        return samochod;
    }


    public void sprawdzPrzeglady(Samochod samochod) {
        int odloscDoPrzegladu = samochod.ileDoPrzegladu();
        System.out.println(odloscDoPrzegladu);

        if (odloscDoPrzegladu > 0) {
            System.out.println("Przegląd dla samochudu marki: " + samochod.marka +
                    " nalezy zrobić za " + odloscDoPrzegladu + " km");
        } else {
            System.out.println("Trzeba było zrobić " + Math.abs(odloscDoPrzegladu) + " km temu!!");
        }
    }


}
