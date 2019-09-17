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
        if (!(another instanceof User)) {
            return false;
        }
        if (another == null){ // null check
            return false;
        }
        User checkedOne = (User) another;
        return name.equals(checkedOne.name) && (surname.equals(checkedOne.surname))
                && (age == checkedOne.age) && (active == checkedOne.active);
    }

    @Override
    public int hashCode() {
        int result = 28;
        result = this.name == null? 1 :23 + name.hashCode();
        result = this.surname == null? 1: 23 + surname.hashCode();
        result *= 23 + age % 3;
        result *= 23 + (active ? 17 : 0);

        return result;
    }
}
