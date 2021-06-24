package obiektowe.improwizacja;

public class MaterialBudowlany {

    String nazwa;
    int ilosc;

    public MaterialBudowlany(String nazwa, int ilosc) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
    }


    //@Override
    public String toString() {
        return "MaterialBudowlany{" +
                "nazwa='" + nazwa + '\'' +
                ", ilosc=" + ilosc +
                '}';
    }
}
