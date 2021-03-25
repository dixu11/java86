package podstawy.wyrazenieSwitch;

import podstawy.projekty.LoteriaMetody;

import java.util.Scanner;

public class InstrukcjeSwitch {
    public static void main(String[] args) {
        System.out.println("Dostępne opcje:");
        System.out.println("1. Uruchom loterie");
        System.out.println("2. Analizuj DNA");
        System.out.println("3. Wylicz raty");
        System.out.println("4. Zamknij program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz numer opcji którą wybierasz:");
        int numer = scanner.nextInt();

        if (numer == 1) {
            System.out.println("Uruchamiam loterię!");
            //LoteriaMetody.zagrajWLoterie();
        } else if (numer == 2) {
            System.out.println("Analizuję DNA");
        }else if(numer == 3){
            System.out.println("Wyliczam raty");
        } else if (numer == 4) {
            System.out.println("Zamknij program");
        } else {
            System.out.println("Nieprawidłowy numer!");
        }

        switch (numer){
            case 1:
                System.out.println("Uruchamiam loterię!");
                break;
            case 2:
                System.out.println("Analizuję DNA");
                break;
            case 3:
                System.out.println("Wyliczam raty");
                break;
            case 4: // nie ma break? spanie na 5 i wykona zamknij program
            case 5:
                System.out.println("Zamknij program");
                break;
            default: // każda inna wartość
                System.out.println("Nieprawidłowy numer!");
        }



    }
}
