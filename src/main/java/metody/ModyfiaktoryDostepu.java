package metody;

import metody.podpakiet.KlasaWInnymPakiecie;

public class ModyfiaktoryDostepu {

    static  int liczba = 10;

    public static void main(String[] args) {
       // System.out.println(ModyfikatoryDostepu2.tekst);
        //pole tekst niedostępne bo prywatne
        System.out.println(ModyfikatoryDostepu2.tekst2);
//        KlasaWInnymPakiecie.pole -> pole nie dostępne
        System.out.println(KlasaWInnymPakiecie.polePubliczne);
        //z innych pakietów dostęp tylko do publicznych


    }
}

// public, protected, default/package,private
//private -> tylko w tej klasie
//domyslny (jeśli nic nie napiszemy) w klasie i pakiecie
// protected -> również w klasach dziedziczących
//public -> we wszstkich pakietach