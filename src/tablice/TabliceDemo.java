package tablice;

class TabliceDemo {

    public static void main(String[] args) {
        double produkt1 = 3.45;
        double produkt2 = 200.99;
        double produkt3 = 5;
        double produkt4 = 33.4;
        double produkt5 = 22.45;

        System.out.println(produkt1);
        System.out.println(produkt2);
        System.out.println(produkt3);
        System.out.println(produkt4);
        System.out.println(produkt5);


        //moja próba przegladania elementów po nazwie zmiennej
       /* int numerProduktu = 1;
        while (numerProduktu < 6){
            System.out.println(produkt+numerProduktu);

            System.out.println(numerProduktu);
            numerProduktu++;
        }*/

       double[] produkty = new double[5];

        produkty[0] = 3.45;
        produkty[1] = 23;
        produkty[2] = 33.04;
        produkty[3] = 10.44;
        produkty[4] = 55.4;
        System.out.println("Pierwszy produkt ma cenę: " + produkty[0] + "zł");
        System.out.println("Pierwszy produkt ma cenę: " + produkty[4] + "zł");

        int numerProduktu = 0; // zmienna przechowujaca aktualny indeks elementu z tablicy ktory chce sprawdzić
        while (numerProduktu < 5){ // tak długo poki indeks nie wykracza poza tablice
            System.out.println("produkt nr: "+ numerProduktu+ " ma cenę: " + produkty[ numerProduktu ] + "zł"); //odczyt
            if (produkty[numerProduktu] < 20) { // specjalna instrukcja tylko dla niektorych produktów
                System.out.println("Promocja na produkt nr: " + numerProduktu);
            }
            numerProduktu++; // przechodzimy do nastepnego produkty (po wyswietleniu nr 0 nastepny bedzie 1)
        }



    }

}
