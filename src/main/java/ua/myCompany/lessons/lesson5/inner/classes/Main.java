package ua.myCompany.lessons.lesson5.inner.classes;

import ua.myCompany.lessons.lesson5.inner.classes.User.Address;

public class Main {
    public static void main(String[] args) {
//        Car bmw = new Car("BMW", 100, 1);
//        Car.Engine engine = bmw.new Engine(1, 1);

        Address address = new Address(1);
        User user = new User("Vasya", "Popov");
    }

}
