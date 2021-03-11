package petle;

import java.util.Random;

class WersjaDoWhile {

    public static void main(String[] args) {


        Random random = new Random();
        int wylosowana;
        int counter = 0;
        int suma = 0;
        do {  //wykonaj te rzeczy (wykonasie minumum raz)
            wylosowana = random.nextInt(20);
            suma += wylosowana;
            System.out.println(wylosowana);
            counter++;
        }while (  wylosowana != 10  ); // powtorz jesli spelnimy warunek
        System.out.println("Znaleziono po " + counter + " rzutów");
        System.out.println("Suma:  " + suma);



    }
}
