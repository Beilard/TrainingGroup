package ua.myCompany.homework.homework4;

/**
 * Holds all parameters related to a student attending a university.
 * Contains an inner static class realisation of the builder pattern.
 */

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
    private static int globalId = 1;

    User(String name, String surname, String secondName) {
        this.id = globalId++;
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
    }

    private User(Builder builder) {
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
        if (Objects.isNull(this)) {
            return "Nothing to display";
        }
        return "Student info: " +
                "ID - " + id +
                ", name - " + name +
                ", surname - " + surname +
                ",\r\n second name - " + secondName +
                ", date of birth - " + dateOfBirth +
                ", address - " + address.toString() +
                ",\r\n phone number " + phoneNumber +
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
            id = User.globalId++;
            name = "no name info";
            surname = "no surname info";
            secondName = "no second name info";
            dateOfBirth = "no date of birth info";
            address = new Address("no city", 0000);
            phoneNumber = "no phone number record";
            faculty = "faculty not assigned";
        }

        public User create() {
            return new User(this);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (courseYear != user.courseYear) return false;
        if (group != user.group) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (surname != null ? !surname.equals(user.surname) : user.surname != null) return false;
        if (secondName != null ? !secondName.equals(user.secondName) : user.secondName != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(user.dateOfBirth) : user.dateOfBirth != null) return false;
        if (address != null ? !address.equals(user.address) : user.address != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(user.phoneNumber) : user.phoneNumber != null) return false;
        return faculty != null ? faculty.equals(user.faculty) : user.faculty == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (faculty != null ? faculty.hashCode() : 0);
        result = 31 * result + courseYear;
        result = 31 * result + group;
        return result;
    }
}
