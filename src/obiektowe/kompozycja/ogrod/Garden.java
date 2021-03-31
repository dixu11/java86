package obiektowe.kompozycja.ogrod;

import java.util.Arrays;

public class Garden {

    //1 ławka  -> Bench
    //klika drzew  -> Tree[]
    //kilka kwiatów -> Flower[]

    private Bench bench = new Bench("drewno"); // stworzy się sama
    private Flower[] flowers; // wstawić z maina
    private Tree[] trees = null; // trzeba wybrać ilość drzew



    public Garden(Flower[] flowers, int treesCount){
        this.flowers = flowers;
        Tree[] trees = new Tree[treesCount];
        for (int i = 0; i < treesCount; i++) {
            trees[i] = new Tree();
        }
        System.out.println(Arrays.toString(trees));

    }


    public void showFlowers() {
        for (Flower flower : flowers) {
            flower.show();
        }
    }







    //siądź na ławce
    //zbierz owoce ze wszystkich drzew
    //podlej wszystkie kwiaty


    @Override
    public String toString() {
        return "Garden{" +
                "bench=" + bench +
                ", flowers=" + Arrays.toString(flowers) +
                ", trees=" + Arrays.toString(trees) +
                '}';
    }
}
