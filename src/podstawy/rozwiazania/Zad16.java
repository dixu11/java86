package podstawy.rozwiazania;

import java.util.Scanner;

class Zad16 {
    public static void main(String[] args) {
        /*Napisz program, który wyświetla tajny komunikat.
                Zanim wyświetli komunikat prosi o podanie hasła liczbowego (sam wymyśl jakie ma być hasło).
        W przypadku wprowadzenia niepoprawnego hasła program pyta ponownie o liczbę tak długo dopóki użytkownik
        nie wpisze poprawnego hasła.*/
        int poprawne = 1234;
        Scanner scanner = new Scanner(System.in);
        int podane;
        do {
            System.out.println("Podaj hasło!");
            podane = scanner.nextInt();
        } while (poprawne != podane);

        System.out.println("Java jest super!@");
    }
}
