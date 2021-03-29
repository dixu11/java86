package rozwiazania.zad34;

/*
Stwórz klasę typu Samochod oraz SamochodDemo z metodą main.
        W metodzie main stwórz dwa obiekty typu samochód.
        Obiekty typu Samochod mają mieć następujące cechy:
        marka, przebieg oraz przebieg do przeglądu,
        ta ostatnia uzupełniona jakąś wartością np 20 000 km.
        W metodzie main nadaj wartości dla cech stworzonych
        wcześniej samochodów.

        Dla obiektów typu Samochod przygotuj następujące zachowania oraz przetestuj je w main:

        Stwórz metodę wyświetlającą markę samochodu oraz przebieg
        Stwórz metodę przyjmującą odległość do przejechania i
        zwiększającą przebieg samochodu o tę odległość
        Stwórz metodę zwracającą ilość kilometrów po których trzeba będzie wykonać przegląd
        (uwzględniając aktualny przebieg)

        wariant trudniejszy: stwórz w main tablicę samochodów a następnie wykorzystując pętlę wyświetl dane każdego z nich
*/


public class SamochodDemo {

    public static void main(String[] args) {
      Samochod samochod1 =  new Samochod();
        samochod1.marka = "BMW";
        samochod1.przebieg = 1000;

      Samochod samochod2 =  new Samochod();
        samochod2.marka = "Fiat";
        samochod2.przebieg = 500;

        samochod1.wyswietlDane();
        samochod2.wyswietlDane();

        samochod1.jedz(50);
        samochod2.jedz(190);

        samochod1.wyswietlDane();
        samochod2.wyswietlDane();

        System.out.println(samochod1.ileDoPrzegladu());
        System.out.println(samochod2.ileDoPrzegladu());
    }

}
