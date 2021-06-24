package serialization.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import serialization.bin.Address;
import serialization.csv.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        Person3 person = new Person3("Marcin", 20);
        System.out.println(person);

        String line = "";
        Scanner scanner = new Scanner(new File("src/main/java/serialization/json/person.json"));
        while (scanner.hasNextLine()) {
            line += scanner.nextLine();
        }
        System.out.println(line);
        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Person3 object = objectMapper.readValue(line, Person3.class);
        Person3 personWithAddress = new Person3("Roman",10,new Address("abc",123));
        objectMapper.writeValue(new File("src/main/java/serialization/json/person2.json"),personWithAddress);
//        objectMapper.writeValueAsString(personWithAddress);


    }
}
