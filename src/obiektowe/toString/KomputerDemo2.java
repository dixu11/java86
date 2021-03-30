package obiektowe.toString;

import java.util.Scanner;

public class KomputerDemo2 {
    public static void main(String[] args) {
        KomputerManager manager = new KomputerManager();
        Komputer otrzmanyKomputer = manager.zbudujKomputer();
        manager.zagrajNaKomputerze(otrzmanyKomputer);
        manager.zwiekszRam(otrzmanyKomputer);
        manager.zagrajNaKomputerze(otrzmanyKomputer);


        //manager tworzy komputer i odpala na nim cyberpunka
        //może zwiekszyć ilośc ramu 2x


    }
}
