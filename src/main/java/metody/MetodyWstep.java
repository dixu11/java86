package metody;

public class MetodyWstep {

    public static void main(String[] args) {
        przywitaj(); // wywołanie metody
       przygotujPizze();
        System.out.println("Koniec!");
    }

    //delkaracja metody
    static void przywitaj(){
        System.out.println("Hello!");
    }

    static void przygotujPizze(){
        wyswietlSkladnikiNaPizze();
        przygotowaniePizzy();
        pieczenie();
    }


    static void wyswietlSkladnikiNaPizze(){
        System.out.println("Potrzebne składniki:");
        System.out.println("ser");
        System.out.println("mąka");
        System.out.println("drożdże");
        System.out.println("Jajka");
        System.out.println("sos pomidorowy");
        System.out.println("Pepperoni!");
        System.out.println("oregano");
    }

    static void przygotowaniePizzy(){
        System.out.println("Przygotować ciasto");
        System.out.println("zetrzeć ser");
        System.out.println("Poukładać");
    }

    static void pieczenie() {
        System.out.println("Piec w 180C");
    }



    //sygnatura
    //ciało { }




}
