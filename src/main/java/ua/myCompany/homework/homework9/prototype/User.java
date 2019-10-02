package ua.myCompany.homework.homework9.prototype;

public class User {
    private Address address;
    private String name;
    private String surname;

    public User(Address address, String name, String surname) {
        this.address = address;
        this.name = name;
        this.surname = surname;
    }

    public User clone() {
        return new User(this.address.clone(), this.name, this.surname);
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
