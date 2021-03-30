package obiektowe.toString;

import java.util.Random;

public class Komputer {

    //cechy
    int ram;
    String kartaGraficzna;

    // konstruktory
    public Komputer(){
        int[] wartosciRam = {4,8,16};
        Random random = new Random();
        ram = wartosciRam[random.nextInt(3)];
        System.out.println("Tworzę komputer");
    }

    public Komputer(int startowyRam, String startowaKarta){  // konstruktor różni się od metody tym że nie ma typu zwracanego a nazwa to nazwa klasy
        ram = startowyRam;
        kartaGraficzna = startowaKarta;
    }

    public Komputer(String startowaKarta){
        ram = 4;
        kartaGraficzna = startowaKarta;
    }


    //zachowania
    void uruchomGre(String gra){
       int wymaganyRam = 0;
        switch (gra){
            case "Cyberpunk":
                wymaganyRam =  16;
                break;
            case "Tetris":
               wymaganyRam = 1;
        }

        if (ram >= wymaganyRam) {
            System.out.println("Odpalasz " + gra);
        } else {
            System.out.println("Nie poszło...");
        }
    }

    public String toString(){ // nadpisanie oryginalnej metody toString odziedziczonej z Object
        return "Komputer ma " + ram + " gb ramu oraz kartę: " + kartaGraficzna;
    }


    //ta metoda już nie potrzebna gdy mamy nadpsany toString :)
    /*public void wyswietlInfo() {
        System.out.println("Komputer ma " + ram + " gb ramu oraz kartę: " + kartaGraficzna);
    }*/
}
