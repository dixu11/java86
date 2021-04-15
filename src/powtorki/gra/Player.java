package powtorki.gra;

public class Player {

    //cechy
    private String profession;
    private int hp;
    private int maxHp;
    private Weapon weapon;
    private boolean alive = true;

    //konstruktor - przygotowanie cech obiektu
    public Player(int hp, int maxHp, String profession, Weapon weapon) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.profession = profession;
        this.weapon = weapon;
    }

    public Player(String profession, int maxHp, Weapon weapon) {
        this.profession = profession;
        this.maxHp = maxHp;
        hp = maxHp;
        this.weapon = weapon;
    }

    //zachowania
    public void attack(Player enemy) {
        System.out.println(profession + " atakuje!");
        int dmg = weapon.attack();
        enemy.hit(dmg);
        if (weapon.isBroken()) {
            System.out.println("Broń zepsuta, zmiana na pięści");
            weapon = new Weapon("Fists", 2, 6);
        }
    }


    //nie można wyleczyć wiecej niż max hp
    public void heal(int hpToHeal) {
        if (hpToHeal < 1) {
            return;
        }
        if (hpToHeal + hp > hp) { //leczymy więcej niż max
            hp = maxHp;
        } else {
            hp = hpToHeal + hp;
        }
    }

    public void hit(int dmgTaken) {
        if (dmgTaken < 1) {
            return;
        }
        if (hp - dmgTaken< 0) {
            alive = false;
            System.out.println(profession + " umiera!");
        } else {
            hp = hp - dmgTaken;
        }
    }

    public String toString() {
        return "Player of profession: " + profession +
                "With " + hp + "/" + maxHp + " hp a jego broń to " + weapon;
    }

    boolean isAlive() {
        return alive;
    }
}
