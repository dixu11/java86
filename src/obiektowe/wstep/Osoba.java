package obiektowe.wstep;

public class Osoba {

    // cechy - pola
    String nazwa;
    int wiek = 18;

    // zachowania - metody
     void wyswietlDane(){
        System.out.println("Mam na imie " + nazwa);
        System.out.println("Mam lat: " + wiek);
    }

    void wyprawUrodziny() {
         wiek+=1;
        System.out.println(nazwa + " obchodzi urodziny!");
    }

    boolean czyPelnoletni() {
        if (wiek >= 18) {
            return true;
        } else {
            return false;
        }
    }

    void dodajNazwisko(String nazwisko) {
        nazwa += " " + nazwisko;
    }




}