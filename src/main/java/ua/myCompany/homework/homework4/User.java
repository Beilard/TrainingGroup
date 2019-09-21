package ua.myCompany.homework.homework4;

/* При необходимости используйте паттерны программирования, которые рассматривали.
1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
Факультет, Курс, Группа.
Создать массив объектов. Вывести:
a) список студентов заданного факультета;
b) списки студентов для каждого факультета и курса;
c) список студентов, родившихся после заданного года;
d) список учебной группы. */

import java.util.Objects;

public class User {
    private int id;
    private String name;
    private String surname;
    private String secondName;
    private String dateOfBirth;
    private Address address;
    private String phoneNumber;
    private String faculty;
    private int courseYear;
    private int group;

    public User(int id, String name, String surname, String secondName) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
    }

    public User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.secondName = builder.secondName;
        this.dateOfBirth = builder.dateOfBirth;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.faculty = builder.faculty;
        this.courseYear = builder.courseYear;
        this.group = builder.group;
    }

    @Override
    public String toString() {
        if (Objects.isNull(this)){
            return "Nothing to display";
        }
        return "Student info: " +
                "ID - " + id +
                ", name - " + name +
                ", surname - " + surname +
                ",\n second name - " + secondName +
                ", date of birth - " + dateOfBirth +
                ", address - " + address.toString() +
                ",\n phone number " + phoneNumber +
                ", faculty - " + faculty +
                ", course year - " + courseYear +
                ", group # - " + group;
    }

    public static class Builder {
        private int id;
        private String name;
        private String surname;
        private String secondName;
        private String dateOfBirth;
        private Address address;
        private String phoneNumber;
        private String faculty;
        private int courseYear;
        private int group;

        Builder() {
            name = "no name info";
            surname = "no surname info";
            secondName = "no second name info";
            dateOfBirth = "no date of birth info";
            address = new Address("no city", 0000);
            phoneNumber = "no phone number record";
            faculty = "faculty not assigned";


        }

        public User create(){
            return new User(this);
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setSecondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public Builder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setFaculty(String faculty) {
            this.faculty = faculty;
            return this;
        }

        public Builder setCourseYear(int courseYear) {
            this.courseYear = courseYear;
            return this;
        }

        public Builder setGroup(int group) {
            this.group = group;
            return this;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourseYear() {
        return courseYear;
    }

    public int getGroup() {
        return group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourseYear(int courseYear) {
        this.courseYear = courseYear;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}
