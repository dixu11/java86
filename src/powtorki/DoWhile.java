package powtorki;

import java.util.Random;

class DoWhile {

    public static void main(String[] args) {
        //losuję liczby tak długo aż nie wypadnie 6

        Random random = new Random();
        int randomNumber;
        do {
            randomNumber = random.nextInt(6) + 1;
            System.out.println(randomNumber);
        } while (randomNumber != 6);


    }
}
