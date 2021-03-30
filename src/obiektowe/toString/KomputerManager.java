package obiektowe.toString;

import java.util.Scanner;

public class KomputerManager {

    Scanner scanner = new Scanner(System.in);

    public Komputer zbudujKomputer() {
        System.out.println("Ile chcesz mieć ramu?");
        int ram = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Jaka karta graficzna?");
        String karta = scanner.nextLine();

        Komputer wlasnyKomputer = new Komputer(ram, karta);
        System.out.println("Oto Twój komputer:");
        System.out.println(wlasnyKomputer);
        return wlasnyKomputer;
    }

    public void zagrajNaKomputerze( Komputer komputer   ){
        System.out.println("W jaką grę chcesz zagrać?");
        String gra = scanner.nextLine();
        System.out.println("Powodzenia!");
        komputer.uruchomGre(gra);
    }

        public void zwiekszRam(Komputer komputer){
            System.out.println("Zwiększymy Ci ram");
            komputer.ram = komputer.ram * 2;
            System.out.println("Twój komputer ma teraz " + komputer.ram + " gb pamięci");
        }


}
