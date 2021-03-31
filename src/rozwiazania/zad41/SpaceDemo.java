package rozwiazania.zad41;

public class SpaceDemo {
    public static void main(String[] args) {
        Probe probe1 = new Probe();
        Probe probe2 = new Probe();
        Probe probe3 = new Probe();

        probe1.send();
        probe2.send();
        probe3.send();

        System.out.println(probe1.getCollectedData());
        System.out.println(probe2.getCollectedData());
        System.out.println(probe3.getCollectedData());

        System.out.println(probe1);
        SpaceStation spaceStation = new SpaceStation(10);
        System.out.println(spaceStation);
        spaceStation.sendProbes();
        System.out.println(spaceStation);
        System.out.println("Zepsutych próbników: " + spaceStation.countDestroyedProbes());
        spaceStation.showResearchResults();
    }
}
