package ua.myCompany.lessons.lesson9.example2.domain;

public class Address {
    public City getCity() {
        return city;
    }

    public Address(City city) {
        this.city = city;
    }

    private final City city;
}
