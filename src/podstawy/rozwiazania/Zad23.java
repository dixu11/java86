package podstawy.rozwiazania;

public class Zad23 {
    public static void main(String[] args) {
        //    metoda wyświetla napis “hello”
//    metoda przyjmuje jako parametr imię i drukuje “Cześć <imie>!”
//    metoda przyjmuje tekst oraz liczbę i drukuje ten tekst taką ilość razy
//        metoda przyjmuje dwa parametry imię oraz wiek. Jeśli przekazano niski wiek,
//        wyświetla “cześć <imie>” jeśli powyżej 20, wyświetla “dzień dobry <imie>”
//        metoda przyjmuje tablicę imion i wita wszystkie przekazane osoby :)
//



                przywitaj();
        przywitaj("Mateusz");
        przywitaj("Martyna");
        powtarzajTekst("Ala ma kota", 10);
        powtarzajTekst("Piotr ma psa", 5);
        przywitaj("Piotr",50);
        przywitaj("Janina",18);
        String[] tablicaImion = {"Mateusz", " Martyna", "Ala", "Piotr", "Janina"};
        przywitaj(tablicaImion);

        wyliczLacznaCene(2,100,0.1);
        wyliczLacznaCene(2,10,0.1);
    }

    static void przywitaj() {
        System.out.println("hello");
    }

    static void przywitaj(String imie){
        System.out.println("Cześć " + imie + "!");
    }

    static void powtarzajTekst(String tekst, int ile){
        for (int i = 0; i < ile; i++) {
            System.out.println(tekst);
        }
    }
    static void przywitaj(String imie, int wiek){
        if (wiek < 20) {
            System.out.println("Cześć " + imie);
        } else {
            System.out.println("Dzień dobry " + imie);
        }
    }

    static void przywitaj(String[] imiona){
        for (int i = 0; i < imiona.length; i++) {
            String imie = imiona[i];
            System.out.println("Witaj: " + imie);
        }

        for(String imie:imiona){ // pętli for-each używamy do przegladania danych ze zbioru
            System.out.println("Witaj: " + imie);
        }
    }


    //        wariant trudniejszy: metoda przyjmuje ilość sztuk towaru, cenę oraz podatek.
//        Powinna wyliczyć łączoną cenę towaru. Jeśli cena przekracza 100 zł powinna
//        ustawić zmienną boolean darmowaWysylka na true. Przygotuj drugą, pomocniczą
//        metodę dla tej pierwszej, która przyjmie łączoną cenę towaru oraz informację
//        o darmowejWysylce i wyświetli stosowny komunikat o cenie do zapłaty oraz
//        informację czy przesyłka będzie za darmo. Do wyświetlonej ceny powinna
//        dodać ew. koszt wysyłki + 10zł.

    static void wyliczLacznaCene(int iloscSztuk, double cena, double podatek){
        boolean darmowaWysylka = false;
        double lacznaCena = iloscSztuk * cena * (podatek+1.0);
        if (lacznaCena > 100){
            darmowaWysylka = true;
        }
        wyswietlPodsumowanie(lacznaCena, darmowaWysylka);
    }

    static void wyswietlPodsumowanie(double lacznaCena, boolean wysylkaDarmowa) {
        double doplata = 10;
        if(wysylkaDarmowa){
            System.out.println("Darmowa wysyłka!");
        }else {
            System.out.println("Dopłata za wysyłkę: " + doplata);
            lacznaCena += doplata;
        }
        System.out.println("Laczna cena to: " + lacznaCena);
    }

}
