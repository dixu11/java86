package obiektowe.kompozycja.ogrod;

import java.util.Arrays;

public class Garden {

    //1 ławka  -> Bench
    //klika drzew  -> Tree[]
    //kilka kwiatów -> Flower[]

    private Bench bench = new Bench("drewno"); // stworzy się sama
    private Flower[] flowers ; // wstawić z maina
    private Tree[] trees ; // trzeba wybrać ilość drzew


    public Garden(Flower[] flowers, int treesCount) {
        this.flowers = flowers;
        trees = new Tree[treesCount];
        for (int i = 0; i < treesCount; i++) {
            trees[i] = new Tree();
        }
        System.out.println(Arrays.toString(trees));
    }

    //siądź na ławce
    public void sitOnBench() {
        bench.sit();
    }

    //podlej wszystkie kwiaty
    public void waterAllFlowers(){
        for(Flower flower : flowers){
            flower.water();
            flower.show();
        }
    }

    //zbierz owoce ze wszystkich drzew
    public int gatherAllFruits(){
        int sum = 0;
        for(Tree tree: trees){
          sum +=  tree.gatherFruits();
        }
        return sum;
    }


    @Override
    public String toString() {
        return "Garden{" +
                "bench=" + bench +
                ", flowers=" + Arrays.toString(flowers) +
                ", trees=" + Arrays.toString(trees) +
                '}';
    }
}
