package serialization.json;

import serialization.bin.Address;

public class Person3 {
    private String name;
    private int age;
    private Address address;

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person3(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //wymagany przez ObjectMapper(bibl.Jackson) domyślny konstruktor - może być prywatny
    private Person3() {
    }


    //aby Mapper widział pola - muszą one mieć gettery
   public String getName() {
        return name;
    }

   public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
