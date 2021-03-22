package tablice;

import java.util.Random;

public class PetleFor {
    public static void main(String[] args) {
        Random random = new Random();


        //wylosuj 10 wartości procentowych i zapisz w tablicy
        double[] procenty = new double[10]; // tablica na 10 miejsc


        for ( int i = 0  ;i < procenty.length  ; i++  ){
            double procent = random.nextDouble();
            procenty[i] = procent;
        }

        for( int i = 0 ; i<procenty.length  ; i++){
            System.out.println(procenty[i]);
        }


    }
}
