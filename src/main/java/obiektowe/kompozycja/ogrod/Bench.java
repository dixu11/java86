package obiektowe.kompozycja.ogrod;

public class Bench {

    private String material;

    public Bench(String material) {
        this.material = material;
    }

    public void sit(){
        System.out.println("Siadasz na ławce z materiału " + material );
    }

    @Override
    public String toString() {
        return "Bench{" +
                "material='" + material + '\'' +
                '}';
    }
}
