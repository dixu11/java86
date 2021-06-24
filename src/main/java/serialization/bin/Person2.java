package serialization.bin;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Scanner;

public class Person2 implements Serializable {

    private String name;
    private int age;
    private Address address;
    transient private Scanner scanner = new Scanner(System.in);

    public static final long serialVersionUID = 5225052124891635144L;


    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person2(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", scanner=" + scanner +
                '}';
    }
}
