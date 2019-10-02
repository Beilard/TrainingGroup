package ua.myCompany.consoleApplication.domain;

import java.time.LocalDate;

public abstract class Member {
    private int id;
    private String name;
    private String surname;
    private String secondName;
    private LocalDate dateOfBirth;
    private Address address;
    private PhoneNumber phoneNumber;
    private String email;
    private String password;
    private String role;

    public Member(int id, String name, String surname, String secondName, LocalDate dateOfBirth,
                  Address address, PhoneNumber phoneNumber, String email, String password, String role) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.role = role;
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

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
