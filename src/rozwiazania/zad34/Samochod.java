package rozwiazania.zad34;

public class Samochod {

    // cechy
    String marka;
    int przebieg;
    int przebiegDoPrzegladu = 20_000;


    // zachowania
    void  wyswietlDane(){
        System.out.println("Marka: "+ marka +
                " przebieg: " + przebieg + " km");
    }

    void jedz(int dystans){
        przebieg = przebieg+dystans;
    }

    int ileDoPrzegladu(){
        return przebiegDoPrzegladu- przebieg;
    }




}
