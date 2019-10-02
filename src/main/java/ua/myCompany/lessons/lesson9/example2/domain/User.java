package ua.myCompany.lessons.lesson9.example2.domain;

public class User {
    public User(Address address) {
        this.address = address;
    }

    private Address address;

    public Address getAddress() {
        return address;
    }
}
