package rozwiazania.zad41;

import java.util.Random;

public class Probe {

    private static String[] outcomesPool = {
            "nowa planeta",
            "nowa asteroida",
            "nowy minerał",
            "kolonia obcych",
            "wykryto wodę",
            "zagrożenie kolizją!"
    };

    private String collectedData = "";
    private boolean active = true;
    private Random random = new Random();


    public void send() {

        if (random.nextBoolean()) {
            collectData();
        } else {
            destroy();
        }
    }


    private void collectData() {
        String randomEffect = outcomesPool[random.nextInt(outcomesPool.length)];
        collectedData = randomEffect;
    }

    private void destroy() {
        collectedData = "<corrupted>";
        active = false;
    }

    public String getCollectedData() {
        return collectedData;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "Probe{" +
                "collectedData='" + collectedData + '\'' +
                ", active=" + active +
                '}';
    }
}
