package ua.myCompany.lesson2.homework;

import java.util.Objects;

public class User {
    private String name;
    private String surname;
    private int age;
    private boolean active;

    public User(String name, String surname, int age, boolean active) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.active = active;
    }

    @Override
    public boolean equals(Object another) {
        if (another == this) { // check if it's a self-check
            return true;
        }
        if (!(another instanceof User)) { // if it had a "is a" relation with the chosen class
            return false;
        }
        User checkedOne = (User)another; //typecast to the chosen class
                                         //in case it's an instance of a child class (?)
        return name.equals(checkedOne.name) && (surname.equals(checkedOne.surname))
                && (age == checkedOne.age) && (active == checkedOne.active);
    }

    @Override
    public int hashCode() {
        int result = 28;
        result *= 23 + name.hashCode();
        result *= 23 + surname.hashCode();
        result *= 23 + age % 3;
        result *= 23 + (active ? 25 : 0);

        return result;
    }
}
