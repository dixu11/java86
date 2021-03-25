package metody;

import java.util.Arrays;

public class Biblioteki2 {
    public static void main(String[] args) {
        int liczba = 10; // typ prymitywny
        Integer liczbaObiektowo = liczba; // obiektowy wrapper na typ prymitywny
        int liczba2 = liczbaObiektowo;

        System.out.println(Math.pow(4, 2));
       int zaokraglona =(int)  Math.round(3.99);
        System.out.println(zaokraglona);

        String[] imiona = {"Maria", "Zofia", "Ania","Radek","Daria","Wojtek","Zbyszek"};
        // 39,44,55,90,100
        System.out.println(Arrays.toString(imiona));
        Arrays.sort(imiona);
        System.out.println(Arrays.toString(imiona));
        int wynik = Arrays.binarySearch(imiona, "Ania");
        System.out.println(wynik);

//        Arrays.fill(imiona, "Marcin");
//        System.out.println(Arrays.toString(imiona));

        imiona = odrzucOstatniElement(imiona);
        System.out.println(Arrays.toString(imiona));

        imiona = Arrays.copyOf(imiona,imiona.length-1);
        System.out.println(Arrays.toString(imiona));
    }

   static String[] odrzucOstatniElement(String[] imiona){
       String[] nowa = new String[imiona.length - 1];
       for (int i = 0; i < nowa.length; i++) {
           nowa[i] = imiona[i];
       }
       return nowa;
    }
}
