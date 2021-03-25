package metody;

public class Pola {

    static String haslo;
    //pole - uzupełniane domyslnymi wartosciami jak tablice
    //przechowywane w pamięci heap

    public static void main(String[] args) {
        String tekst;
        //zmienne lokalne - nie mają domyślnych wartości
        //przechowywane w stack

        String haslo = "Inne hasło";


       // System.out.println(tekst);
        System.out.println(haslo);
        ustalHaslo();
        String doWyswietlenia = zakodujHaslo();
        System.out.println(doWyswietlenia);
        obstawLitere("a");

    }

    static void ustalHaslo(){
       haslo = "Ala ma kota";
    }

    static String zakodujHaslo(){
        System.out.println("PRzed zakodowaniem "  + haslo);
        return "___ __ ____";
    }

    static void obstawLitere(String litera){
        System.out.println("Szukam litery w " + haslo);
    }



}
