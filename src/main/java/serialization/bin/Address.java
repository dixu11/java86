package serialization.bin;

import java.io.Serializable;

public class Address implements Serializable {

    private String street;
    private int nr;

    public Address() {
    }

    public Address(String street, int nr) {
        this.street = street;
        this.nr = nr;
    }

    public String getStreet() {
        return street;
    }

    public int getNr() {
        return nr;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", nr=" + nr +
                '}';
    }
}
