package obiektowe.kompozycja.ogrod;

public class Flower {

    private boolean bloom = false;
    private String color;

    public Flower(String color) {
        this.color = color;
    }

    public void show() {
        if (bloom) {
            System.out.println(color + " kwiat kwitnie");
        } else {
            System.out.println("Kwiat nie kwitnie");
        }
    }

    public void water() {
        bloom = true;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "bloom=" + bloom +
                ", color='" + color + '\'' +
                '}';
    }
}
