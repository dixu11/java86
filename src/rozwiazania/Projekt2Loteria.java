package rozwiazania;

import java.util.Random;
import java.util.Scanner;

public class Projekt2Loteria {

    public static void main(String[] args) {
//        Symulator loterii liczbowej:
//        wprowadzenie 6 liczb (1-24)
//        wylosowanie 6 liczb (1-24)
//        sprawdzenie, które liczby są trafione
//        wyświetlenie wyniku i nagrody:
//        0-2 = 0zł, 3 = 16 zł
//        4 = 200zł, 5 = 4 000 zł
//        6 = 1 500 000 zł

        //wprowadzenie liczb
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] pobrane = new int[6];



        for (int i = 0; i < 6; i++) {
           /* do {
                System.out.println("Wprowadź liczbę nr " +(i+1)+" (od 1 do 24)");
                pobrane[i] = scanner.nextInt();
            } while (pobrane[i] > 24);*/

            System.out.println("Wprowadź liczbę nr " + (i + 1) + " (od 1 do 24)");
            pobrane[i] = scanner.nextInt();

            if (pobrane[i] > 24 || pobrane[i] <= 0) {
                System.out.println("Nieprawidłowa wartość");
                i--;
            }
        }
        int[] wylosowane = new int[6];
        for(int i = 0; i<6; i++){
            wylosowane[i] =random.nextInt(24)+1;
        }

        //wyswietl wszystkie wylosowane
        System.out.println("Podane:");
        for(int pobrana:pobrane){
            System.out.print(pobrana+ ", ");
        }
        System.out.println();
        System.out.println("Wylosowane: ");
        for(int wylosowana:wylosowane){
            System.out.print(wylosowana+ ", ");
        }
        System.out.println();

        int trafienia = 0;
        for(int pobrana: pobrane){
            for(int wylosowana: wylosowane){
                //System.out.println("czy " + pobrana + " jest równa " + wylosowana);
                if(pobrana == wylosowana){
                    //System.out.println("TAK!");
                    trafienia++;
                }
            }
        }

        System.out.println("trafienia: " + trafienia);

        System.out.print("Wygrałeś:  ");
    if(trafienia <=2){
        System.out.println("0zł");
    }else if(trafienia == 3){
        System.out.println("16zł");
    }else if(trafienia == 4){
        System.out.println("200zł");
    }else if(trafienia == 5){
        System.out.println("4000zł");
    }else{
        System.out.println("Brawo!");
        System.out.println("1 500 000 zł");
    }


//        0-2 = 0zł, 3 = 16 zł
//        4 = 200zł, 5 = 4 000 zł
//        6 = 1 500 000 zł
    }


}
