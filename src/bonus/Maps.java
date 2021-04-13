package bonus;

import java.util.HashMap;
import java.util.Map;

class Maps {

    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0] = 23;
        numbers[1] = 2;
        numbers[2] = 33;
        numbers[3] = 55;

        System.out.println(numbers[2]);


        //przechowują pary klucz wartość, pozwalają dostać się do wartości podając klucz
        HashMap<String, Integer> daysOfWeek = new HashMap<>();
        daysOfWeek.put("poniedziałek", 1);
        daysOfWeek.put("wtorek", 2);
        daysOfWeek.put("środa", 3);
        daysOfWeek.put("czwarek", 4);
        daysOfWeek.put("piątek", 5);

        System.out.println(daysOfWeek.get("wtorek"));

        for( String dayOfWeek: daysOfWeek.keySet()){
            System.out.println(dayOfWeek + " " + daysOfWeek.get(dayOfWeek));
        }




    }



}
