package rozwiazania.zad34;

public class Samochod {

    // cechy
   public String marka;
   public int przebieg;
   public int przebiegDoPrzegladu = 20_000;


public Samochod(String startowaMarka, int startowyPrzebieg){
    marka = startowaMarka;
    przebieg = startowyPrzebieg;
}

    // zachowania
    void  wyswietlDane(){
        System.out.println("Marka: "+ marka +
                " przebieg: " + przebieg + " km");
    }

    public String toString() {
    return "Marka: " + marka + " przebieg: " + przebieg;
    }

    void jedz(int dystans){
        przebieg = przebieg+dystans;
    }

   public int ileDoPrzegladu(){
        return przebiegDoPrzegladu- przebieg;
    }




}
