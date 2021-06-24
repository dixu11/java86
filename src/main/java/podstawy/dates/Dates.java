package podstawy.dates;

import java.time.*;
import java.time.format.DateTimeFormatter;
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

        LocalDate myDate = LocalDate.now(); //aktualna data
        //System.out.println(System.currentTimeMillis());
        System.out.println(myDate);
        LocalDate birthday = LocalDate.of(1990, 10, 26); // konkretna data
        System.out.println(birthday);
        System.out.println(birthday.plusDays(20));

        LocalDate dateFromString = LocalDate.parse("1999-10-23"); // z tekstu do daty
        System.out.println(dateFromString);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yy");

        LocalDate dateFromString2 = LocalDate.parse("23.10.99", format); // budowanie LocalDate z wykorzystaniem patternu
        System.out.println("Z wykorzystaniem formatu: " + dateFromString2.minusYears(100));
        System.out.println(dateFromString2.format(format)); //wyświetwietlanie z  wykorzystaniem patternu

        System.out.println("---------");
        LocalDate other = LocalDate.of(2020, 7, 9);
        LocalDate now = LocalDate.now();
        System.out.println(now);
        now = now.plusDays(5);
        now = now.plusWeeks(5);
        now = now.plusYears(5);
        now = now.plusMonths(5);
        System.out.println(now);
        System.out.println(other);
        Period period = now.until(other);
        System.out.println(period);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
        System.out.println(now.isAfter(other));

        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime actual = LocalDateTime.now();
        System.out.println(actual);


        //literały całkowite:
        int hexadecimal = 0x89abcdef; //szesnastkowy
        int decimal = 123345; // dziesiętny
        int octal = 0567; // ósemkowy
        int binary = 0b101101; // binarny
        System.out.println(decimal);
        System.out.println(binary);





    }
}
