package podstawy.narzedzia;

import java.util.Scanner;

public class ScannerProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę");
        int kwota = scanner.nextInt();  // 10\n
        scanner.nextLine();  // można dać dodatkowy "nextLine" na 'zmarnowanie'
       // scanner = new Scanner(System.in); // można stworzyć scanner jeszcze raz

        System.out.println("Podaj walutę:");
        String waluta = scanner.nextLine();

        System.out.println(kwota + waluta);
    }
}
