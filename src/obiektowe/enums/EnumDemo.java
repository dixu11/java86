package obiektowe.enums;

import javax.swing.*;

class EnumDemo {

    public static void main(String[] args) {
        int worldDirection = WorldDirection.NORTH;
        int worldDirection2 = WorldDirection.WEST;
        int worldDirection3 = WorldDirection.NORTH;
        int worldDirection4 = WorldDirection.WEST;
        int worldDirection5 = WorldDirection.NORTH;

        if (worldDirection == (worldDirection4)) {
            System.out.println("Te same");
        } else {
            System.out.println("Inne");
        }

        ShirtSize size = ShirtSize.M;
        ShirtSize size2 = ShirtSize.XS;

        System.out.println(size== size2);

        System.out.println(size.getEuropeanSize());
        System.out.println(size2.getEuropeanSize());

        Shirt shirt = new Shirt(ShirtSize.XL);
        System.out.println("Koszulka ma rozmiar: " + shirt.getSize());
        System.out.println("Koszulka ma rozmiar: " + shirt.getEuropeanSize());


        ShirtSize[] allSizes = ShirtSize.values();
        for (ShirtSize allSize : allSizes) {
            System.out.println(allSize);
        }
        System.out.println(size.ordinal());

        switch (size){
            case XS:
            case S:
                System.out.println("Mały");
                break;
            case M:
                System.out.println("sredni");
                break;
            case L:
            case XL:
                System.out.println("Duży");
                break;
        }

        System.out.println(ShirtSize.findShirtSizeByEuropean(8));
        System.out.println(ShirtSize.findShirtSizeByEuropean(9));
        System.out.println(ShirtSize.findShirtSizeByEuropean(10));
        System.out.println(ShirtSize.findShirtSizeByEuropean(11));
        System.out.println(ShirtSize.findShirtSizeByEuropean(12));
        System.out.println(ShirtSize.findShirtSizeByEuropean(13));
        System.out.println(ShirtSize.findShirtSizeByEuropean(14));
    }

}
