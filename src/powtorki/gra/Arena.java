package powtorki.gra;

class Arena {

    private Player player1;
    private Player player2;

    Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void fight() {

        int turn = 0;
        do {
            Player attacker = player1;
            Player defender = player2;
            if(turn%2 ==0){
                attacker = player2;
                defender = player1;
            }
            attacker.attack(defender);
            turn++;
        } while (player1.isAlive() && player2.isAlive());

    }

}
