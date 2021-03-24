package podstawy.projekty;

//        Symulator loterii liczbowej:
//        wprowadzenie 6 liczb (1-24)
//        wylosowanie 6 liczb (1-24)
//        sprawdzenie, które liczby są trafione
//        wyświetlenie wyniku i nagrody:
//        0-2 = 0zł, 3 = 16 zł
//        4 = 200zł, 5 = 4 000 zł
//        6 = 1 500 000 zł
//        Użyj każdego z poznanych narzędzi: zmienna, operatory, warunek, tablice, Scanner, Random, Pętle..
//        wariant trudniejszy: Liczby wprowadzane ani liczby losowane nie mogą się  powtarzać.


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LoteriaMetody {

    public static void main(String[] args) {
        int[] wprowadzone = wprowadzLiczby();
        System.out.println("Twoje liczby: ");
        wyswietlZbior(wprowadzone);
        int[] wylosowane = wylosujLiczby();
        System.out.println("Wylosowane liczby: ");
        wyswietlZbior(wylosowane);
        int trafienia = policzTrafienia(wprowadzone,wylosowane);
        oglosWygrana(trafienia);
    }

    static int[] wprowadzLiczby() {
        Scanner scanner = new Scanner(System.in);
        int[] podane = new int[6];

        for (int i = 0; i < podane.length; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbę (1-24): ");
            int podana =  scanner.nextInt();;
            if (podana < 1 || podana > 24 || czyWystepujeWZbiorze(podane,podana)) {
                System.out.println("Zła liczba!");
                i--; // aby zostać przy tym samym powtorzeniu
                continue; // przerywa to wykonanie petli i przechodzi do nastepnego
            }
            podane[i] =podana;
            System.out.println(Arrays.toString(podane));
        }
        return podane;
    }

    static void wyswietlZbior(int[] zbior) {
        for (int podana : zbior) {
            System.out.print(podana + " ");
        }
        System.out.println();
    }

    static int[] wylosujLiczby() {
        Random random = new Random();
        int[] losowe = new int[6];
        for (int i = 0; i < losowe.length; i++) {
            int wylosowana = random.nextInt(24) + 1;
            if(czyWystepujeWZbiorze(losowe,wylosowana)){
                i--;
            }
            losowe[i] = wylosowana;

        }
        return losowe;
    }

    static int policzTrafienia(int[] podane, int[] losowe){
        int trafienia = 0;
        for (int podana : podane) {
            for (int wylosowana : losowe) {
                // System.out.println("Program porównuje liczbę " + podana + " z wylosowaną: " + wylosowana );
                if (podana == wylosowana) {
                    trafienia++;
                }
            }
        }
        System.out.println("Trafiłeś: " + trafienia);
        return trafienia;
    }

    static void oglosWygrana(int trafienia) {
        int wygrana;
        if (trafienia <= 2) {
            System.out.println("Nic nie wygrałeś!");
            return;
        } else if (trafienia == 3) {
            wygrana = 16;
        } else if (trafienia == 4) {
            wygrana = 200;
        } else if (trafienia == 5) {
            wygrana = 4000;
        } else {
            System.out.println("Nagroda główna!");
            wygrana = 1_500_000;
        }
        System.out.println("Twoja wygrana wynosi: " + wygrana + " zł");
    }

    static boolean czyWystepujeWZbiorze(int[] zbior, int poszukiwana){
        for(int przegladana : zbior){
            if (przegladana == poszukiwana) { // poszukiwana jest taka sama jak liczba ze zbioru:
                return true; // znaleziona!
            }
        }
        return false; // jeśli przeszliśmy całą pętle zwracamy false -> brak w zbiorze
    }
}
//1  2  1  3  2