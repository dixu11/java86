package podstawy.rzutowanie;

public class RzudowanieDemo {
    public static void main(String[] args) {
        int liczba = 10;
        double mojDouble = liczba;
        System.out.println(mojDouble);

        double  pi= 3.914;
        liczba =(int) pi;
        System.out.println(liczba);

       int wynik =(int) dodaj(2, 2);
        System.out.println(wynik);

       int wynik2 = (int) podniesDoPotegi(2);
        System.out.println(wynik2);

        int liczbaTest = 2344535;
        byte mojByte =(byte) liczbaTest;
        System.out.println("Byte wynosi: " + mojByte);

        int liczba2 = -234;
        char symbol = (char) liczba2;
        System.out.println(symbol);

        liczba2 = 'a';
        System.out.println(liczba2);


        int rzutowanieDemo = (int) (23.8 + 45.3);
        System.out.println(rzutowanieDemo);
        

    }

    static double dodaj(double a, double b){
        return a + b;
    }


    static long podniesDoPotegi(long liczba) {
        return liczba * liczba;
    }


}
