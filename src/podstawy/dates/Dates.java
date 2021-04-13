package podstawy.dates;

import java.time.LocalDate;
import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        String date = "23-10-99";
        String date2 = "02.12.2007";
        System.out.println(date);
        System.out.println(date2);

        //problemy:
        //1. nic z tym się nie da zrobić (jedynie operacje na tekscie)
        //2. brak możliwości prostego przestawienia daty na inną
        //3. brak kontroli formatu
        //4. brak kontroli czy istnieje taka data np. 30.02

        LocalDate myDate = LocalDate.now();
        System.out.println(System.currentTimeMillis());
        System.out.println(myDate);
        LocalDate birthday = LocalDate.of(1990, 10, 26);
        System.out.println(birthday);

        System.out.println(birthday.plusDays(20));
    }
}
