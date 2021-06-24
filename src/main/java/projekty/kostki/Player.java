package projekty.kostki;

public class Player {

    private int points = 0;
    private int nr;

    public Player(int nr) {
        this.nr = nr;
    }

    public void addPoints(int score){
        points += score;
    }

    public int getPoints() {
        return points;
    }

    public boolean hasWon() {
        return points >= 100;
    }

    @Override
    public String toString() {
        return "player nr " + nr;
    }
}
