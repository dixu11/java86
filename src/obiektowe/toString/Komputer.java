package obiektowe.toString;

public class Komputer {

    //cechy
    int ram;
    String kartaGraficzna;


    //metody
    //ta metoda już nie potrzebna gdy mamy nadpsany toString :)
    /*public void wyswietlInfo() {
        System.out.println("Komputer ma " + ram + " gb ramu oraz kartę: " + kartaGraficzna);
    }*/

    void uruchomGre(){

    }

    public String toString(){ // nadpisanie oryginalnej metody toString odziedziczonej z Object
        return "Komputer ma " + ram + " gb ramu oraz kartę: " + kartaGraficzna;
    }

}
