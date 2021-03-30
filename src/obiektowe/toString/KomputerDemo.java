package obiektowe.toString;

public class KomputerDemo {
    public static void main(String[] args) {
        Komputer komputer = new Komputer();
        komputer.ram = 8;
        komputer.kartaGraficzna = "GT 1030";

        Komputer komputer2 = new Komputer();
        komputer2.ram = 32;
        komputer2.kartaGraficzna = "RTX 2060";

       // komputer.wyswietlInfo();
       // komputer2.wyswietlInfo();

        System.out.println(komputer);
        System.out.println(komputer2);

        komputer.ram = 16;

        System.out.println(komputer);









    }
}
