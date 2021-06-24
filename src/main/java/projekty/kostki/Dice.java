package projekty.kostki;

import java.util.Random;

public class Dice {

    private int result1;
    private int result2;



    public void throwTwoDices() {
        result1 = throwDie();
        result2 = throwDie();
    }

    private int throwDie() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public int getSum() {
        return result1 + result2;
    }

    public boolean isResultOne() {
        return result1 == 1 || result2 == 1;
    }

    public int getResult1() {
        return result1;
    }

    public int getResult2() {
        return result2;
    }
}
