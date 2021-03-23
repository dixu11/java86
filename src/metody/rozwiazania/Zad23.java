package metody.rozwiazania;

public class Zad23 {
    public static void main(String[] args) {
        //    metoda wyświetla napis “hello”
//    metoda przyjmuje jako parametr imię i drukuje “Cześć <imie>!”
//    metoda przyjmuje tekst oraz liczbę i drukuje ten tekst taką ilość razy

        przywitaj();
        przywitaj("Mateusz");
        przywitaj("Martyna");
        powtarzajTekst("Ala ma kota", 10);
        powtarzajTekst("Piotr ma psa", 5);
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
}
