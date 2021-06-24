package serialization.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonCSVRepository {

    public void savePerson(Person person) {

    }


    public List<Person> loadPeople() {
        List<Person> people = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/serialization/csv/people.csv"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] lineElements = line.split(",");
                String name = lineElements[0];
                int age = Integer.parseInt(lineElements[1]);
                Person person = new Person(name, age);
                people.add(person);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return people;
    }

    public List<Person> loadPeople2() {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("src/serialization/csv/people.csv"))) {
            return reader.lines()
                    .map(line -> line.split(","))
                    .map(lineElements -> new Person(lineElements[0], Integer.parseInt(lineElements[1])))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }


}
