package powtorki.gra;

class GameLauncher {
    public static void main(String[] args) {
        Weapon wand = new Weapon("Wand", 0, 100);
        Weapon sword = new Weapon("Sword", 20, 40);
        Player warrior = new Player("Swordmaster",400,sword);
//        warrior.hp = 200;
//        warrior.maxHp = 300;
//        warrior.profession = "Swordmaster";

        Player mage = new Player("Spellcaster",300,wand);
//        mage.hp = 80;
//        mage.maxHp = 100;
//        mage.profession = "Spellcaster";

//        System.out.println(warrior.hp);
//        System.out.println(warrior.profession);

//        System.out.println(mage.hp);
//        System.out.println(mage.profession);
//        warrior.display();
//        mage.display();
        System.out.println(warrior);
        System.out.println(mage);
        warrior.heal(20);
        System.out.println(warrior);
        mage.heal(1000);
        System.out.println(mage);

        System.out.println("--------------");
        Arena arena = new Arena(warrior, mage);
        arena.fight();
    }
}
