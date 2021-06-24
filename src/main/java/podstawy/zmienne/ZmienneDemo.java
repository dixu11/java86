package podstawy.zmienne;

class ZmienneDemo {

    public static void main(String[] args) {
        // TYP NAZWA_ZMIENNEJ = LITERAL lub WYRAZENIE;  // przygotowanie zmiennej
        String nazwa = "HP";
        int cena = 7000;
        double oprocentowanie = 1.23;
        int liczbaRat = 12;
        double cenaZOprocentowaniem = cena * oprocentowanie;
        double kosztJednejRaty = cenaZOprocentowaniem / liczbaRat;

        System.out.println("Komputer firmy " + nazwa + " kosztuje: " + cena + " zł");
        System.out.println("Z doliczeniem podatku: " + cenaZOprocentowaniem + "zł");
        System.out.println("Podzielone na "+ liczbaRat + " rat: " + kosztJednejRaty + "zł");

        boolean mniejszaNizWymagane = kosztJednejRaty < 500;
        System.out.println("Czy cena raty mniejsza niż 500zł? Odpowiedz: " + mniejszaNizWymagane);

        System.out.println("Teraz pora inny komputer");
        nazwa = "Asus"; // nadpisanie
        System.out.println("Komputer: " + nazwa);

    }

}
