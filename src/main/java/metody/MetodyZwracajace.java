package metody;

public class MetodyZwracajace {
    public static void main(String[] args) {
        int zwroconaWartosc = prostaMetoda();
        System.out.println(zwroconaWartosc);
        int suma = dodajLiczby(2, 3);
        System.out.println("Wynikiem dodania 2 i 3 jest: " + suma);

        boolean czyDodatnia = czyLiczbaJestDodatnia(5);
        System.out.println(czyDodatnia);
        if (czyLiczbaJestDodatnia(10)) {
            System.out.println("Dodatnia!");
        }


        if (czyParzysta(10)) {
            System.out.println("Parzysta");
        } else {
            System.out.println("Nieparzysta");
        }

    }

    static int prostaMetoda() {
        return 5;
    }

    static int dodajLiczby(int liczba1, int liczba2) {
        return liczba1 + liczba2;
    }

    static boolean czyLiczbaJestDodatnia(int liczba) {
        if (liczba > 0) {
            return true;
        } else {
            return false;
        }
    }

   public static double ustaOprocentowanie(int raty) {
        double creditRation;
        if (raty < 6 || raty > 48) {
            System.out.println("Nieporawna ilość rat");
            creditRation = -1;
        } else if (raty <= 12) {
            creditRation = 0.025;
        } else if (raty <= 24) {
            creditRation = 0.05;
        } else {
            creditRation = 0.1;
        }
        return creditRation;
    }


    public static boolean czyParzysta(int liczba){
        return liczba % 2 == 0;
    }


}
