package powtorki.gra;

public class Player {

    //cechy
    String profession;
    int hp;
    int maxHp;

    //zachowania
    public void display() {
        System.out.println("Player of profession: " + profession);
        System.out.println("With " + hp + "/" + maxHp + " hp");
    }

    //nie można wyleczyć wiecej niż max hp
    public void heal(int hpToHeal) {
        if (hpToHeal + hp > hp) { //leczymy więcej niż max
            hp = maxHp;
        } else {
            hp = hpToHeal + hp;
        }
    }
}
