package wczytywanie;


import java.util.Scanner;
//import java.lang.String;

class WczytywanieDemo {
    public static void main(String[] args) {

 /*       Napisz program który oblicza wskaźnik BMI: wzór: waga/wzrost².
        Waga ma być podana w kilogramach, a wzrost w metrach.
                Dodatkowo program ma sprawdzić czy BMI jest powyżej 24,9 -
            nadwaga lub czy BMI jest poniżej 18,5 - niedowaga.
            Poinformuj w konsoli o każdym działaniu programu.*/


        Scanner wczytywacz = new Scanner(System.in);

        System.out.println("Jak masz na imię?");
        String imie = wczytywacz.nextLine();
        System.out.println("Siema " + imie + "!" );

        System.out.println("Jaką masz wagę (kg)");
        int waga = wczytywacz.nextInt();
        System.out.println("Waga to: " + waga + "kg");

        System.out.println("Jaki masz wzrost (m)");
        double wzrost = wczytywacz.nextDouble();
        System.out.println("Wzrost to: " + wzrost + "m");

        double bmi = waga / (wzrost * wzrost);
        System.out.println("Twoje BMI: " + bmi);
        boolean nadwaga = bmi > 24.9;
        boolean niedowaga = bmi < 18.5;
        System.out.println("Nadwaga: " + nadwaga);
        System.out.println("Niedowaga: " + niedowaga);

    }
}
