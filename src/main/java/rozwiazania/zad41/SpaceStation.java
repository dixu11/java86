package rozwiazania.zad41;

import java.util.Arrays;

public class SpaceStation {

        private Probe[] probes;

        public SpaceStation(int probesCount){
            probes = new Probe[probesCount];
            for (int i = 0; i < probes.length; i++) {
                Probe probe = new Probe();
                probes[i] = probe;
            }
        }

        public void sendProbes(){
            for(Probe probe: probes){
                probe.send();
            }
        }

    public int countDestroyedProbes() {
            int counter= 0;
        for (Probe probe : probes) {
            if (!probe.isActive()) {
                counter++;
            }
        }
        return counter;
    }

    public void showResearchResults(){
        for (Probe probe : probes) { // iter
            //if(!probe.getCollectedData().contains("corrupted")){
            if(probe.isActive()){
                System.out.println("Wynik analizy: " +  probe.getCollectedData());
            }
        }
    }


    //napraw próbniki
    //zapisz zebrane dane
    //zbuduj więce próbników

    //leć w inny sektor.....


    @Override
    public String toString() {
        return "SpaceStation{" +
                "probes=" + Arrays.toString(probes) +
                '}';
    }
}
