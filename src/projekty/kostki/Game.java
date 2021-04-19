package projekty.kostki;

import java.util.Random;
import java.util.Scanner;

//tylko w tej klasie wykonujemy komunikaty i pobieramy dane z konsoli
public class Game {
    //cechy
    private Player[] players;
    private int playerIndex; //od zera! 0 -> pierwszy gracz 1 -> drugi gracz
    private Dice dice = new Dice();

    //konstruktory
    public Game() {
        players = new Player[2];
        players[0] = new Player();
        players[1] = new Player();
        playerIndex = 0;
    }

    //zachowania
    public void start() {
        System.out.println("Rozpoczynam grę!");

        do {
            System.out.println("Tura gracza " + (playerIndex + 1));
            System.out.println("Ilość punktów: " + players[playerIndex].getPoints());
            System.out.println();
            System.out.println("Rzucasz kostkami!");

            dice.throwTwoDices();
            showResult();
            players[playerIndex].addPoints(dice.getSum());
            if (dice.isResultOne()) {

            }
        }while (keepPlaying());

        System.out.println("Tura kolejnego gracza!");

    }

    public void showResult() {
        System.out.println("Na pierwszej kostce: " + dice.getResult1());
        System.out.println("Na drugiej kostce: " + dice.getResult2());
    }

    public boolean keepPlaying() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grasz dalej czy pasujesz? g/p");
        String odp = scanner.nextLine();
        return odp.equalsIgnoreCase("g");
    }


}
