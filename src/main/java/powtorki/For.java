package powtorki;

import java.util.Arrays;
import java.util.Random;

class For {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        Random random = new Random();

//        numbers[0] = random.nextInt(10) + 1;
//        numbers[1] = random.nextInt(10) + 1;
//        numbers[2] = random.nextInt(10) + 1;
//        numbers[3] = random.nextInt(10) + 1;
//        numbers[4] = random.nextInt(10) + 1;
//        numbers[5] = random.nextInt(10) + 1;

        System.out.println(Arrays.toString(numbers));

        //with for:
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(numbers));


    }
}
