package ua.myCompany.lessons.lesson9.example3.service;

import ua.myCompany.lessons.lesson9.example3.domain.User;

import java.util.List;

//service - business logic: registration, log-in
public interface UserService {
    User register(User user);

    User login (String login, String password);

    List<User> findAllUsers ();

}
