package powtorki.gra;

class Weapon {

    private String name;
    private int minDmg;
    private int maxDmg;
    private int durability = 5;
    private boolean broken = false;

    Weapon(String name, int minDmg, int maxDmg) {
        this.name = name;
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
    }

    public int attack() {
        if (broken) {
            System.out.println("Najpierw napraw broń!");
            return 0;
        }
        durability--;
        if (durability == 0) {
            System.out.println(name + " zepsuty!");
            broken = true;
            return 0;
        }
        if (durability < 4) {
            System.out.println("Broń kruszy się w rękach");
        }

        System.out.println("Atak bronią " + name);
        int dmg = getRandomDmg();
        System.out.println("Za: " + dmg+ " obrażeń");
        return dmg;
    }
    private int getRandomDmg() {
        maxDmg = maxDmg + 1;
        return (int) ((Math.random() * (maxDmg - minDmg)) + minDmg);
    }

    public String toString() {
        return name;
    }

    boolean isBroken() {
        return broken;
    }
}
