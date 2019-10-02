package ua.myCompany.homework.homework9.prototype;

public class Address {
    private final String city;
    private final int code;

    public Address(String city, int code) {
        this.city = city;
        this.code = code;
    }

    public Address clone() {
        return new Address(this.city, this.code);
    }

    public String getCity() {
        return city;
    }

    public int getCode() {
        return code;
    }
}
