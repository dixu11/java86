package rozwiazania;

import java.util.Random;

public class Zad22 {
    public static void main(String[] args) {
//        Za pomocą pętli wylosuj milion liczb z przedziału 1-100 i zapisz je w tablicy.
//                Następnie stosując kolejną pętle policz ile razy wystąpiła liczba 25 i wyświetl
//        tę informację na końcu programu

        int[] wylosowane = new int[1_000_000];
        Random random = new Random();
        for(int i = 0; i< wylosowane.length ;i++){
            wylosowane[i] = random.nextInt(100) +1; // 1-100
        }
        int wystapieniaWybranejLiczby = 0;
      /*  for(int i = 0; i< wylosowane.length ;i++){
            int aktualna = wylosowane[i];
            if(aktualna == 25){
                wystapieniaWybranejLiczby++;
            }
        }*/

        for(int wylosowana: wylosowane){
            if(wylosowana == 25){
                wystapieniaWybranejLiczby++;
            }
        }

        for( int wylosowana: wylosowane){
            System.out.println(wylosowana);
        }

        //for-each gdy przegladamy zbiory i chcemy odczytać wszystkie wartości
        System.out.println("Liczba 25 wystąpiła: " + wystapieniaWybranejLiczby);

    }
}
