package obiektowe.kompozycja.ogrod;

import java.util.Random;

public class Tree {

    private int fruits;

    public Tree() {
        Random random = new Random();
        fruits = random.nextInt(200);
    }


    public int gatherFruits() {
        int gatheredFruits = fruits;
        fruits = 0;
        return gatheredFruits;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "fruits=" + fruits +
                '}';
    }
}
