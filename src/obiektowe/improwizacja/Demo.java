package obiektowe.improwizacja;

public class Demo {
    public static void main(String[] args) {
        MaterialBudowlany cement = new MaterialBudowlany("cement",160);
        MaterialBudowlany cegly = new MaterialBudowlany("cegly",200);

        System.out.println(cement);
        System.out.println(cegly);

        PlacBudowy placBudowy = new PlacBudowy(cegly,cement);
//        placBudowy.material1 = cegly;
//        placBudowy.material2 = cement;

        System.out.println(placBudowy);
        placBudowy.rozpocznijBudowe();
        System.out.println(placBudowy);

    }
}
