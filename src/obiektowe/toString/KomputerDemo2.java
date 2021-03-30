package obiektowe.toString;

import java.util.Scanner;

public class KomputerDemo2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile chcesz mieć ramu?");
        int ram = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Jaka karta graficzna?");
        String karta = scanner.nextLine();

        Komputer wlasnyKomputer = new Komputer(ram, karta);
        System.out.println("Oto Twój komputer:");
        System.out.println(wlasnyKomputer);

        System.out.println("W jaką grę chcesz zagrać?");
        String gra = scanner.nextLine();
        System.out.println("Powodzenia!");
        wlasnyKomputer.uruchomGre(gra);

        KomputerManager manager = new KomputerManager();
        manager.zwiekszRam(wlasnyKomputer);
        //manager tworzy komputer i odpala na nim cyberpunka
        //może zwiekszyć ilośc ramu 2x



    }
}
