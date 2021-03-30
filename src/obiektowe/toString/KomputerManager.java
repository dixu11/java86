package obiektowe.toString;

public class KomputerManager {


        public void zwiekszRam(Komputer komputer){
            System.out.println("Zwiększymy Ci ram");
            komputer.ram = komputer.ram * 2;
            System.out.println("Twój komputer ma teraz " + komputer.ram + " gb pamięci");

        }


}
