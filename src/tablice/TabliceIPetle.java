package tablice;

public class TabliceIPetle {

    public static void main(String[] args) {
        double[] srednieOceny = new double[]{4.5, 3.3, 3.5, 2.9, 5.1, 4.4};
        System.out.println("W klasie mamy: " + srednieOceny.length + " uczniów");
        System.out.println("Uczniowie dostali następujące oceny (średnie większe niż 3):");
        int index = 0;
        while (index< srednieOceny.length){ // index mniejszy od długości tablicy
            if(srednieOceny[index]>3){
                System.out.println(index+1 + ". " + srednieOceny[index]);
            }
            index++;
        }
    }

}
