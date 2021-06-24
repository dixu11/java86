package serialization.csv;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonCSVRepository {


    private static final String PATH = "src/serialization/csv/people.csv";

    public void savePerson(Person person) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(PATH,true));
            String csv = person.getName() + "," + person.getAge();
            writer.newLine();
            writer.append(csv);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //PrintWriter - inny sposób


    public List<Person> loadPeople() {
        List<Person> people = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(PATH));
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
