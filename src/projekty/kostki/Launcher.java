package projekty.kostki;

public class Launcher {

  /*  https://iftemplar.github.io/works/pig-dice-game/


    wariant trudniejszy:  to co wcześniej oraz:
    jeśli na obu kostkach wypadnie to samo - zyskujesz 2x tyle punktów np. 2 i 2 daje 8.
    Dodaj do programu możliwość kupowania ulepszeń.
    Za 30 punktów można wykupić dodatkową kostkę
    za 20 punktów można zwiększyć przedział losowania o 1 na wszystkich kostkach (np z 1-6 na 1-7).*/


    public static void main(String[] args) {
        Game game = new Game();
        game.playGame();

    }
}
