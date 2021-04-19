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
        players[0] = new Player(1);
        players[1] = new Player(2);
        playerIndex = 0;
    }

    //zachowania
    public void playGame() {
        System.out.println("Rozpoczynam grę!");
        Player winner;
        do{
            roundIntro();
            int roundPints = playRound();
            endRound(roundPints);
            winner = getWinner();
        }while (winner == null);

        System.out.println("Winner is: " + winner);
    }

    private void roundIntro() {
        System.out.println("Tura gracza " + (playerIndex + 1));
        System.out.println("Ilość punktów: " + players[playerIndex].getPoints());
    }

    private int playRound() {

        int roundPoints = 0;
        do {
            System.out.println("Punkty z rundy: " + roundPoints);
            System.out.println();
            System.out.println("Rzucasz kostkami!");

            dice.throwTwoDices();
            showResult();
            roundPoints += dice.getSum();

            if (dice.isResultOne()) {
                System.out.println("Wypadło 1, tracisz punkty");
                roundPoints = 0;
                break;
            }
        }while (keepPlaying());
        return roundPoints;
    }

    private void endRound(int roundPoints) {
        players[playerIndex].addPoints(roundPoints);
        System.out.println("Tura kolejnego gracza!");
        System.out.println("Ostatecznie uzskałeś: " + players[playerIndex].getPoints());
        if (playerIndex == 0) {
            playerIndex = 1;
        } else {
            playerIndex = 0;
        }
    }

    private Player getWinner() {
        if(players[0].hasWon()){
            return players[0];
        } else if (players[1].hasWon()) {
            return players[1];
        } else {
            return null;
        }
    }

    private void showResult() {
        System.out.println("Na pierwszej kostce: " + dice.getResult1());
        System.out.println("Na drugiej kostce: " + dice.getResult2());
    }

    private boolean keepPlaying() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grasz dalej czy pasujesz? g/p");
        String odp = scanner.nextLine();
        return odp.equalsIgnoreCase("g");
    }


}
