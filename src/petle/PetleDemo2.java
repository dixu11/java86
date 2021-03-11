package petle;

import java.util.Random;

class PetleDemo2 {
    public static void main(String[] args) {
        Random random = new Random(); // bedziemy losować
        int wylosowana = 0;
        int counter = 0; //liczy wykonania
        int suma = 0; // do tego sumujemy liczby
        while (  wylosowana != 10  ){ // powtarzamy jeśli nie wylosowaliśmy 10
            wylosowana = random.nextInt(20);
            suma += wylosowana; // "dorzucam" teraz wylosowaną
            System.out.println(wylosowana);
            counter++;
        }
        System.out.println("Znaleziono po " + counter + " rzutów");
        System.out.println("Suma:  " + suma);

    }
}
