package ua.myCompany.lessons.lesson6.task4.domain;

public class Address {
    private final String address;
    private final int code;

    public Address(String address, int code) {
        this.address = address;
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public int getCode() {
        return code;
    }
}
