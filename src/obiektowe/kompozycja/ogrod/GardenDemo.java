package obiektowe.kompozycja.ogrod;

public class GardenDemo {
    public static void main(String[] args) {
        //Bench bench = new Bench("drewno");
       // bench.sit();

        //System.out.println(bench);

        Flower flower1 = new Flower("czerwony");
        Flower flower2 = new Flower("fioletowy");

        Tree tree = new Tree();
        Tree tree2 = new Tree();

        System.out.println(tree);
        System.out.println(tree2);

        System.out.println("Zebrałem owoców: " + tree.gatherFruits());
        System.out.println("Zebrałem owoców: " + tree2.gatherFruits());

        System.out.println(tree);
        System.out.println(tree2);

      /*  Flower[] flowers = new Flower[2];
        flowers[0] = flower1;
        flowers[1] = flower2;*/
        Flower[] flowers = {flower1,flower2}; // skrocony sposób

        Garden garden = new Garden(flowers, 5); // Flower[]
        //garden.showFlowers();
        System.out.println(garden);
    }
}
