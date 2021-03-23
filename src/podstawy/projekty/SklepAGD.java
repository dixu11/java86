package podstawy.projekty;

import metody.MetodyZwracajace;

import java.util.Scanner;

public class SklepAGD {

    /*
    * W sklepie ze sprzętem AGD oferowana jest sprzedaż ratalna.
Napisz program umożliwiający wyliczenie wysokości miesięcznej raty za zakupiony sprzęt.
*  Danymi wejściowymi dla programu są:
• cena towaru (od 100 zł do 10 tys. zł),
• liczba rat (od 6 do 48).
Program powinien sprawdzać, czy podane dane mieszczą się w określonych powyżej zakresach, a w przypadku błędu wyświetlać stosowny komunikat i natychmiast zakończyć działanie programu. (użyj instrukcji return)
Kredyt jest oprocentowany w zależności od liczby rat:
 • od 6–12 wynosi 2.5% ,
• od 13–24 wynosi 5%,
• od 25–48 wynosi 10%.
Obliczona miesięczna rata powinna zawierać również odsetki.

    *
    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cene z zakresu 100-10 000");
        double cena = scanner.nextDouble();
        if (cena < 100 || cena > 10000) {
            System.out.println("Nieporawna cena");
            System.exit(1);
        }

        System.out.println("Podaj ilość rat 6-48");
        int raty = scanner.nextInt();
        double creditRation = MetodyZwracajace.ustaOprocentowanie(raty); // kod przeniosłem do osobnej metody w klasie MetodyZwracajace
        if (creditRation == -1) {
            System.exit(0);
        }

        double cenaZPodatkiem = cena * (1.0 + creditRation);
        double cenaRaty = cenaZPodatkiem / raty;
        System.out.println("Cena raty wynosi: " + cenaRaty + "zł");
    }
}
