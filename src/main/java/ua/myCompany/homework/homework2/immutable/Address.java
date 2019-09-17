package ua.myCompany.homework.homework2.immutable;

public class Address implements Cloneable {
    private String city;
    private int code;

    public Address(String city, int code) {
        this.city = city;
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public int getCode() {
        return code;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
