package ua.myCompany.consoleApplication.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Student extends Member {

    private Department department;
    private int courseYear;
    private int group;

    public Student(Builder builder) {
        super(builder.id, builder.name, builder.surname, builder.secondName,
                builder.dateOfBirth, builder.address, builder.phoneNumber,
                builder.email, builder.password, "User");

        this.department = builder.department;
        this.courseYear = builder.courseYear;
        this.group = builder.group;

    }

    public static Builder builder() {
        return new Builder();
    }

    public Department getDepartment() {
        return department;
    }

    public int getCourseYear() {
        return courseYear;
    }

    public int getGroup() {
        return group;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getCourseYear() == student.getCourseYear() &&
                getGroup() == student.getGroup() &&
                Objects.equals(getAddress(), student.getAddress()) &&
                Objects.equals(getPhoneNumber(), student.getPhoneNumber()) &&
                Objects.equals(getDepartment(), student.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddress(), getPhoneNumber(), getDepartment(), getCourseYear(), getGroup());
    }

    public static class Builder {
        private int id;
        private String name;
        private String surname;
        private String secondName;
        private LocalDate dateOfBirth;
        private Address address;
        private PhoneNumber phoneNumber;
        private Department department;
        private int courseYear;
        private int group;
        private String email;
        private String password;

        private Builder() {
        }

        public Student build() {
            return new Student(this);
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

        public Builder setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setPhoneNumber(PhoneNumber phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setDepartment(Department department) {
            this.department = department;
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

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }


    }
}
