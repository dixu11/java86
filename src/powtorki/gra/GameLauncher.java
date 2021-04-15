package powtorki.gra;

class GameLauncher {
    public static void main(String[] args) {
        Player warrior = new Player();
        warrior.hp = 200;
        warrior.maxHp = 300;
        warrior.profession = "Swordmaster";

        Player mage = new Player();
        mage.hp = 80;
        mage.maxHp = 100;
        mage.profession = "Spellcaster";

//        System.out.println(warrior.hp);
//        System.out.println(warrior.profession);

//        System.out.println(mage.hp);
//        System.out.println(mage.profession);
        warrior.display();
        mage.display();
        warrior.heal(20);
        warrior.display();
        mage.heal(1000);
        mage.display();
    }
}
