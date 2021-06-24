package podstawy.instrukcjeWarunkowe;

import java.util.Random;
import java.util.Scanner;

class InstrukcjeWarunkoweDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile ścianek ma mieć kostka?");
        int iloscScianek = scanner.nextInt();

        if(iloscScianek < 2 ){
            System.out.println("Nie można podać liczby mniejszej niż 2!");
            System.exit(1); // zamyka aplikacje
        }

        Random random = new Random();
        int wynikRzutu = random.nextInt(iloscScianek) +1;
        System.out.println("Wylosowano " + wynikRzutu);

    }
}
