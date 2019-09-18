package ua.myCompany.homework.homework3.builder;

public class Builder implements BuildTools {
    String name;
    String surname;
    String email;
    String password;
    int code;

    Builder(){}

    public User build(){
        return new User(this);
    }

    @Override
    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Builder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public Builder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public Builder setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public Builder setCode(int code) {
        this.code = code;
        return this;
    }
}
