package ua.myCompany.lessons.lesson6.task4.domain;

import java.time.LocalDate;

public class Student {
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

    public Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.secondName = builder.secondName;
        this.dateOfBirth = builder.dateOfBirth;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.department = builder.department;
        this.courseYear = builder.courseYear;
        this.group = builder.group;
    }

    public static Builder builder() {
        return new Builder();
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
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

        if (id != student.id) return false;
        if (courseYear != student.courseYear) return false;
        if (group != student.group) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (surname != null ? !surname.equals(student.surname) : student.surname != null) return false;
        if (secondName != null ? !secondName.equals(student.secondName) : student.secondName != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(student.dateOfBirth) : student.dateOfBirth != null) return false;
        if (address != null ? !address.equals(student.address) : student.address != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(student.phoneNumber) : student.phoneNumber != null) return false;
        return department != null ? department.equals(student.department) : student.department == null;
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
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + courseYear;
        result = 31 * result + group;
        return result;
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
    }
    
}
