package obiektowe.lists;

import rozwiazania.zad34.Samochod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListsDemo {




    public static void main(String[] args) {
        //Tablice

        //Listy
        //Sety
        //Mapy
        //Kolejki
        //Stosy

        int[] numbers = {23, 45, 67, 78, 23};
        System.out.println(Arrays.toString(numbers));
        numbers = addElement(33, numbers);
        System.out.println(Arrays.toString(numbers));
        numbers = addElement(50, numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[0]);
        int liczba = numbers[0];
        System.out.println("--------ArrayList------------");
        ArrayList<String> list = new ArrayList<>();
        list.add("23");
        list.add("hello");
        list.add("xyz");
        System.out.println(list);
        System.out.println(list.size());
        list.add("abc");
        System.out.println(list);
        System.out.println(list.size());
        list.remove(0);
        list.remove("hello");
        System.out.println(list);

        // byte - Byte, short - Short, int - Integer, char - Character, boolean - Boolean
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(456);
        numbersList.add(45);
        numbersList.add(4);
        numbersList.add(5);
        numbersList.add(6);
        numbersList.add(66);
        numbersList.add(666);
        System.out.println(numbersList);
        for (Integer integer : numbersList) {
            System.out.print(integer + ", ");
        }
        System.out.println();
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.println(numbersList.get(i));
        }
        numbersList.remove(6);
        System.out.println(numbersList);
//        numbersList.clear();
        System.out.println(numbersList);
        System.out.println(numbersList.isEmpty());
        numbersList.addAll(List.of(23, 45, 56));
        System.out.println(numbersList);
        numbersList.removeAll(List.of(23, 45, 56));
        System.out.println(numbersList);
        numbersList.retainAll(List.of(4, 5, 6));
        System.out.println(numbersList);
        numbersList.set(0, 100);
        numbersList.add(0, 100);
        System.out.println(numbersList);
    }

    public static int[] addElement(int element, int[] array){
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        // 3 oryginalny    ->    4   nowy    -> 3 przedostatnie miejsce w nowym
        newArray[array.length] = element;
        return newArray;
    }
}
