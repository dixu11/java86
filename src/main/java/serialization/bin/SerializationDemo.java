package serialization.bin;

import serialization.csv.Person;

public class SerializationDemo {
    public static void main(String[] args) {
        Address address = new Address("abc",12);
        Person2 person = new Person2("Asia", 33, address);
        PersonBinRepository repository = new PersonBinRepository();
//        repository.savePerson(person);
        System.out.println(repository.load());

    }
}
