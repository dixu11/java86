package metody;

import java.util.Arrays;

public class MetodyString {
    public static void main(String[] args) {
        String tekst = "Ala MA kota";
    //  tekst =  tekst.toUpperCase();
        System.out.println(tekst.toUpperCase());
        System.out.println(tekst);
        System.out.println(tekst.charAt(2));
        System.out.println(tekst.isEmpty());
        System.out.println(tekst.length());
        System.out.println(tekst.compareTo("Renata ma kota")); // ujemna -> przed, dodatnia -> po aflabetycznie
        System.out.println(tekst.concat(". ").repeat(4).toUpperCase().length()); // można kolejkować wywołania metod tak długo jak używamy typu który ma metody
        System.out.println(tekst.equals("ala ma kota"));
        System.out.println(tekst.equalsIgnoreCase("ala ma kota"));
        System.out.println(tekst.toLowerCase().contains("ma")); // contains ignore case :)
        System.out.println(tekst.endsWith("ota"));
        System.out.println(tekst.replace("kota","psa"));
        System.out.println(tekst.substring(2)); //od 2 znaku do konca
        System.out.println(tekst.substring(3, 8)); // od 3 do 8 znaku tekst
        String[] podzielonyTekst = tekst.split(" ");
        System.out.println(podzielonyTekst.length);
        for(String fragment : podzielonyTekst){
            System.out.println(fragment);
        }
        char[] znaki = tekst.toCharArray();
        System.out.println(Arrays.toString(znaki));

        System.out.println(tekst);
    }
}
