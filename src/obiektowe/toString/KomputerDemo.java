package obiektowe.toString;

public class KomputerDemo {
    public static void main(String[] args) {
        Komputer komputer = new Komputer(8,"GT 1030");
        //komputer.ram = 8;
       // komputer.kartaGraficzna = "GT 1030";

        Komputer komputer2 = new Komputer(32, "RTX 2060");
        //komputer2.ram = 32;
      //  komputer2.kartaGraficzna = "RTX 2060";
       // new Komputer(); // wywoła konstrukto bezparametrowy

        Komputer komputer3 = new Komputer("RTX 2000");


        // komputer.wyswietlInfo();
        // komputer2.wyswietlInfo();

        System.out.println(komputer);
        System.out.println(komputer2);
        System.out.println(komputer3);



        System.out.println(komputer);

        komputer.uruchomGre("Cyberpunk");
        komputer.uruchomGre("Tetris");

        komputer2.uruchomGre("Cyberpunk");
        komputer2.uruchomGre("Tetris");

        komputer.ram = 16;


    }
}
