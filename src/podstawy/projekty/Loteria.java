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

public class Loteria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] podane = new int[6];

        for (int i = 0; i < podane.length; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbę (1-24): ");
            podane[i] = scanner.nextInt();
            if (podane[i] < 1 || podane[i] > 24) {
                System.out.println("Zła liczba!");
                i--; // aby zostać przy tym samym powtorzeniu
            }
        }

        System.out.println(Arrays.toString(podane)); // szybki sposób na wyświetlenie tablicy

        System.out.println("Twoje liczby: ");
        for (int podana : podane) {
            System.out.print(podana + " ");
        }
        System.out.println();

        Random random = new Random();
        int[] losowe = new int[6];
        for (int i = 0; i < losowe.length; i++) {
            losowe[i] = random.nextInt(24) + 1;
        }

        System.out.println("Wylosowane liczby: ");
        for (int wylosowana : losowe) {
            System.out.print(wylosowana + " ");
        }
        System.out.println();

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

        int wygrana;

        if(trafienia<= 2){
            System.out.println("Nic nie wygrałeś!");
            return;
        }else if(trafienia == 3){
            wygrana = 16;
        }else if(trafienia == 4){
            wygrana = 200;
        } else if (trafienia == 5) {
            wygrana = 4000;
        } else {
            System.out.println("Nagroda główna!");
            wygrana = 1_500_000;
        }
        System.out.println("Twoja wygrana wynosi: " + wygrana + " zł");

    }


}
