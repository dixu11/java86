package podstawy.tablice;

public class TablicePrzypomnienie {

    public static void main(String[] args) {
        //trzy sposoby stworzenia tablicy
        int[] liczby = new int[4]; // standardowy (tablica będzie wypełniona zerami)
        liczby[0] = 123234;
        liczby[1] = 1344;
        liczby[2] = -2;
        liczby[3] = 33;
        System.out.println(liczby[0]+ " " + liczby[1] + " " + liczby[2] + " " + liczby[3]);

        int[] liczby2 = new int[]{123234, 1334, -2, 33}; // skrócony
        System.out.println(liczby2[0]+ " " + liczby[1] + " " + liczby[2] + " " + liczby2[3]);

        int[] liczby3 = {123234, 1334, -2, 33}; // bardzo skrócony :)
        System.out.println(liczby3[0]+ " " + liczby[1] + " " + liczby[2] + " " + liczby3[3]);

        String[] imiona = {"Romeo", "Julia"};
    }


}
