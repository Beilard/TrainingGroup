package ua.myCompany.homework.homework3.builder;

public class User {
    private final String name;
    private final String surname;
    private final String email;
    private final String password;
    private final int code;

    public User(String name, String surname, String email, String password, int code) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getCode() {
        return code;
    }
}
