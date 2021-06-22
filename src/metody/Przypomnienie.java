package metody;

import java.util.List;
import java.util.Random;

public class Przypomnienie {

  public transient static int field;


    public static void main(String[] args) {
        prostaMetoda();
        prostaMetoda();

        wydrukujLiczby(23,45);



        System.out.println(zwrocLiczbe() * 2);
        int liczba = zwrocLiczbe(); // metoda zwracająca wartość pozostawia to co napiszemy przy 'return' w miejscu gdzie ją wywołaliśmy
        Random random = new Random();
        int losowa = random.nextInt(10); // tu też stosowaliśmy zwracanie

        System.out.println(polacz("Jan", "Kowalski"));
        System.out.println(polacz("Janina", "Kowalska"));

        int sum = sumNumbers(3, 5, 6, 7, 675, 4);
        System.out.println(sum);

    }

    //<typDostępu> <static> <typ zwracany> <nazwa> (<parametr1>,<parametr2>...) { <instrukcje> }

    //sygnatura
    //kod metody w { }
    public static void prostaMetoda(   ){
        System.out.println("To jest instrukcja 1 prostej metody");
        System.out.println("To jest instrukcja 2 prostej metody");
    }

    //wysyłanie danych do metody -> zastosowanie parametrów
    private static void wydrukujLiczby(int liczba1, int liczba2){
        System.out.println(liczba1);
        System.out.println(liczba2);
    }

    //odbieranie danych z metody -> zastosowanie ZWRACANIA wartości (return)
    private static int zwrocLiczbe(){
        return 9;
    }


    //metoda może coś zwracać i coś przyjmować
    private static String polacz(String imie, String nazwisko){
        String osoba = imie + " " + nazwisko;
        if (imie.endsWith("a")) {
            return "Pani " + osoba;
        } else {
            return "Pan "+  osoba;
        }
    }

    public static int sumNumbers(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }



}
