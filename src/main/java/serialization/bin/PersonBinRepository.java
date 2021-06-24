package serialization.bin;

import java.io.*;

public class PersonBinRepository {

    private static final String PATH = "src/serialization/bin/person.bin";

    public void savePerson(Person2 person) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH));
            oos.writeObject(person);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Person2 load() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH));
            Person2 person = (Person2) ois.readObject();
            ois.close();
            return person;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
