package ua.myCompany.consoleApplication.domain;

import java.time.LocalDate;

public class Admin extends Member {
    private String supervisorName;

    public Admin(Builder builder) {
        super(builder.id, builder.name, builder.surname, builder.secondName,
                builder.dateOfBirth, builder.address, builder.phoneNumber,
                builder.email, builder.password, "Admin");
        this.supervisorName = builder.supervisorName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int id;
        private String name;
        private String surname;
        private String secondName;
        private LocalDate dateOfBirth;
        private Address address;
        private PhoneNumber phoneNumber;
        private String email;
        private String password;
        private String supervisorName;

        private Builder() {
        }

        public Admin build() {
            return new Admin(this);
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

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setSupervisorName(String supervisorName) {
            this.supervisorName = supervisorName;
            return this;
        }
    }
}
