package ua.myCompany.homework.homework4;

public final class Address implements Cloneable {
    private final String city;
    private final int code;

    public Address(String city, int code) {
        this.city = city;
        this.code = code;
    }

    @Override
    public String toString() {
        return city + ", city code: " + code;
    }

    public String getCity() {
        return city;
    }

    public int getCode() {
        return code;
    }

}
