package rozwiazania;


 /*Przygotuj następujące metody i przetesuj w main:
         metoda przyjmuje dwa argumenty typu double oraz int. Zwraca pierwszą liczbę podniesioną do potęgi wartości
          drugiej liczby. Wynik zwraca w double
         przetestuj powyższą metodę dla liczb 3 oraz 5, wynik zapisz do zmiennej int i wyświetl.
          Wykorzystaj rzutowanie. Po przekazaniu jakich wartości program będzie wyświetlać nieprawidłowe wyniki?
           Przetestuj to.
         przygotuj metodę przyjmującą ilość minut i zwracającą ilość milisekund.
         Jako typ zwracany metody zadeklaruj wartość long.
         Wykorzystaj tę metodę dla przeliczenia 5 min. Wartość zwróconą przypisz do zmiennej int i wyświetl.
          Wykorzystaj rzutowanie.
           Potestuj metodę i sprawdź, jakie argumenty musiałbyś przekazać aby metoda zaczęła dawać niepoprawne wyniki?
*/

public class Zad25 {

    public static void main(String[] args) {
        System.out.println(poteguj(2, 0));
        System.out.println(poteguj(2, 1));
        System.out.println(poteguj(2, 2));
        System.out.println(poteguj(2, 3));
        int wynik = (int) poteguj(3.5, 5);
        System.out.println(poteguj(3.5, 5));
        System.out.println(wynik);

        int iloscMinut = 100_000;
         int milisekundy =(int) przeliczNaMilisekundy(iloscMinut);
         long milisekundy2 = przeliczNaMilisekundy(iloscMinut);
        System.out.println(milisekundy);
        System.out.println(milisekundy2);
    }


    static double poteguj(double wartosc, int potega) {
        if (potega == 0) {
            return 1;
        }
        double wynik = wartosc;
        for (int i = 0; i < potega - 1; i++) {
            wynik = wynik * wartosc;
        }
        return wynik;
    }

    static long przeliczNaMilisekundy(double minuty){
        //1 min -> 60 sec
        //1 sec -> 1000ms
        return (long)(minuty *60 * 1000);
    }

}
