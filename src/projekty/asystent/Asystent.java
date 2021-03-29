package projekty.asystent;

import projekty.Loteria;
import projekty.LoteriaMetody;
import projekty.SklepAGD;

import java.util.Random;
import java.util.Scanner;

public class Asystent {

    /*Etap 1:
    Stwórz pakiet asystent i skopiuj do niego trzy klasy najciekawszych programów które do tej pory zrobiłeś.
    W klasie Asystent zaimplementuj metodę główną void rozpocznijProgram( ) i wywołaj ją w metodzie main.
    Następnie zaimplementuj dwie metody pomocnicze:
    String generujPowitanie() - losuje jedno z pięciu możliwych przywitań,
    String generujPozegnanie() - zwraca tekst składający się losowo z 1-5 słów “pa” zakończonych “!” np. “papapa!”
    Wywołaj te metody i wyświetl zwrócone wartości w konsoli.*/

    /*
    * Etap 2:
Nad metodami dodaj statyczne pole przechowujące dostępne opcje programu jako tablica typu String. Przykładowe opcje: “Zagrajmy w lotto”, “wyświetl prostokąt”, “policz do 10”.
Zaimplementuj metodę void uruchomMenu() i wywołaj ją pomiędzy przywitaniem, a pożegnaniem. Metoda powinna korzystać z 3 mniejszych metod:
void drukujListeOpcji( ) - metoda drukuje opcję z jej numerem wykorzystując wcześniej stworzone pole,
int pobierzWybor( ) - metoda prosi o podanie opcji interesującej użytkownika tak długo, dopóki nie poda on liczby z właściwego zakresu i zwraca wybór,
void uruchomOpcje( int ) - metoda przyjmuje wcześniej pobraną liczbę i wyświetla opcję, która została wybrana.
    * */

    private static String[] dostepneOpcje = {
            "Zagraj w loterię",
            "Kup produkt na raty",
            "przelicz minuty na milisekundy",
            "zamknij program"
    };
    private static boolean uruchomiony = true;

    public static void main(String[] args) {
        rozpocznijProgram();
    }

    private static void rozpocznijProgram() {
        System.out.println(generujPowitanie());
        uruchomMenu();
        System.out.println(generujPozegnanie());
    }

    private static String generujPowitanie() {
        String[] przywitania = {"Cześć", "Czołem", "Witaj", "Siema", "Dzień dobry", "Elo"};
        Random random = new Random();
        int i = random.nextInt(przywitania.length);
        return przywitania[i] + "!";
    }

    private static void uruchomMenu() {
        do {
            wyswietlOpcje();
            int wybor = pobierzWybor();
            System.out.println("Wybrano: "+ wybor);
            uruchomOpcje(wybor);
            wstawPrzerwe();
        }while (uruchomiony );
    }

    private static void wyswietlOpcje() {
        System.out.println("Dostępne opcje:");
        for (int i = 0; i < dostepneOpcje.length; i++) {
            System.out.println(i+1 + ". " + dostepneOpcje[i]);
        }
    }

    private static int pobierzWybor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz numer wybranej opcji:");
        int wybor = scanner.nextInt();
        if (wybor > 0 && wybor <= dostepneOpcje.length) {
            return wybor;
        } else {
            System.out.println("Niepoprawny numer, wpisz liczbę z zakresu od 1 do " + dostepneOpcje.length);
           return pobierzWybor();
        }
    }

    private static void uruchomOpcje(int wybor){
        switch (wybor){
            case 1:
                LoteriaMetody.zagrajWLoterie();
                break;
            case 2:
                SklepAGD.kupSprzet();
                break;
            case 3:
                przeliczMinuty();
                break;
            case 4:
                System.out.println("Zamknij program");
                uruchomiony = false;
                break;
            default:
                System.out.println("Nie ma takiej opcji"); //ponieważ już wcześnie sprawdzam - nie ma prawa tu wejsc
        }
    }

    private static void przeliczMinuty() {
        System.out.println("Podaj ilośc minut:");
        Scanner scanner = new Scanner(System.in);
        int minuty = scanner.nextInt();
        long milisekundy = PrzeliczanieCzasu.przeliczMinutyNaMilisekundy(minuty);
        System.out.println(minuty + " minut to " + milisekundy + " milisekund");
    }

    private static String generujPozegnanie() {
        String pozegnanie = "";
        Random random = new Random();
        int ileRazy = random.nextInt(5) + 1;
        for (int i = 0; i < ileRazy; i++) {
            pozegnanie += "pa";
        }
        return pozegnanie + "!";
    }

    private static void wstawPrzerwe(){
        for (int i = 0; i < 5; i++) {
            System.out.println();
        }
    }

}
