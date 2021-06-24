package java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String> names = List.of("Marcin", "Magda", "Maria", "Arek");
        names.stream()
                .filter( name -> name.startsWith("M") )
                .forEach(name -> System.out.println(name));

        List<String> filtered = names.stream()
                .filter(name -> name.length() >= 5)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filtered);

        List<Person> people = names.stream()
                .map( name-> new Person(name,LocalDate.now().minusYears(new Random().nextInt(30))))
                .collect(Collectors.toList());

        System.out.println(people);

        long result = people.stream()
                .map(person -> person.getBirthDate())
                .map(date -> date.until(LocalDate.now(), ChronoUnit.YEARS))
                .sorted((age1, age2) -> (int) (age2 - age1))
                .findFirst()
                .orElse(-1L);

        System.out.println("Najwyzszy wiek: " +   result);
    }
}

class Person{

    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }


    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}



