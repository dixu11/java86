package metody;

import java.util.Scanner;

public class Biblioteki {
    public static void main(String[] args) {

        String tekst = "abcd";
        System.out.println(tekst.toUpperCase()); // typy referencyjne mogą posiadać metody

        int liczba = 123;
//        System.out.println(liczba.); // brak metod
        // Byte, Short, Integer, Long, Boolean, Character
       String jakoTekst =  Integer.toString(123);
        System.out.println(Integer.max(10, 20));
        String liczbaJakoTekst = "123";
        int wynik = Integer.parseInt(liczbaJakoTekst);
        System.out.println(wynik *2);
        String zdanie = "Ala ma 5 kotów";
        String[] tab = zdanie.split(" ");
        System.out.println(tab[2]);
        int iloscKotowAli = Integer.parseInt(tab[2]);
        iloscKotowAli++;


        System.out.println("Ilość kotów Ali +1 to: " + iloscKotowAli);
        System.out.println(Character.isDigit('a'));

        int podana = wczytajLiczbe();
        System.out.println("Podano:" + podana);
    }


    static int wczytajLiczbe(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        String liczbaString = scanner.nextLine();
        char[] znaki = liczbaString.toCharArray();
        for(char znak : znaki){
            if (!Character.isDigit(znak)) {
                System.out.println("Podałeś znak!");
                return -1;
            }
        }
        return Integer.parseInt(liczbaString);
    }
}
