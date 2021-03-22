package podstawy.rozwiazania;

public class Zad20 {
    public static void main(String[] args) {
//        Szybkim sposobem stwórz tablicę 10 liczb i wstaw wartości z przedziału 1 - 1000.
//        za pomocą pętli wyświetl wszystkie liczby,
//        wyświetl tylko liczby większe niż 100,
//                wyświetl tylko nieparzyste liczby i mniejsze niż 750.
//
//        wariant trudniejszy:  za pomocą pętli policz średnią tych liczb

       int [] liczby = {234,45,67,899,23,444,555,666,777,10};
       int i = 0;
       while(i<liczby.length){
           System.out.println(liczby[i]);
           i++;
       }
        System.out.println(".........");

        i = 0;
        while (i < liczby.length) {
            if (liczby[i] > 100) {
                System.out.println(liczby[i]);
            }
            i++;
        }
        System.out.println("........");

        i = 0;
        while (i<liczby.length){
            int aktualnaLiczba = liczby[i];
            if(aktualnaLiczba <750 && aktualnaLiczba %2 == 1){
                System.out.println(aktualnaLiczba);
            }
            i++;
        }

    }
}
