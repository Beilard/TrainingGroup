package ua.myCompany.homework.homework3.builder;

public class User {
    private final String name;
    private final String surname;
    private final String email;
    private final String password;
    private final int code;

    public User(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.password = builder.password;
        this.code = builder.code;
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

    @Override
    public String toString() {
        return "Info about the user: " +
                "name is '" + name + '\'' +
                ", surname is '" + surname + '\'' +
                ", email is '" + email + '\'' +
                ", password is '" + password + '\'' +
                ", code is " + code;
    }
}
