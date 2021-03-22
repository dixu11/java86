package podstawy.instrukcjeWarunkowe;

import java.util.Scanner;

class Warunki2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaką temperaturę ma woda?");
        int temperatura =  scanner.nextInt();
//        int temperatura = 10;


        if (temperatura >= 100) {
            System.out.println("Woda paruje");
        } else if(temperatura>80){
            System.out.println("Woda gotuje się");
        } else if(temperatura>0){
            System.out.println("Woda w stanie ciekłym");
        } else{
            System.out.println("Woda zamarza");
        }

        if (temperatura != 0) {
            System.out.println("temperatura to nie jest 0 stopni");
        }


        //% -> operator modulo

        System.out.println(14%4);  //4,8,12 -> zostało 2
        System.out.println(14%5);  //5,10 -> zostało 4
        System.out.println(3%2);  // 2 ->  1
        System.out.println(4%2);  // 2,4 ->  0

        boolean pelnoletni = true;


        if (!pelnoletni ) {
            System.out.println("Nie może palić");
        } else {
            System.out.println("Może palić papierosy");
        }


    }
}
