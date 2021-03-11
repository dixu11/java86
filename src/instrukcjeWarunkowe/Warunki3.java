package instrukcjeWarunkowe;

class Warunki3 {

    public static void main(String[] args) {

        int numerMiesiaca = 4;
        int promocja;

        if (numerMiesiaca == 1) {
           promocja = 10;
        } else if (numerMiesiaca == 2) {
            promocja = 20;
        } else if (numerMiesiaca == 3) {
            promocja = 5;
        }else{
            promocja = 0;
        }

        System.out.println("Promocja wynosi: " + promocja);

    }


}
