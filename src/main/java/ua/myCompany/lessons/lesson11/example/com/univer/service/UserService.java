package ua.myCompany.lessons.lesson11.example.com.univer.service;

import ua.myCompany.lessons.lesson11.example.com.univer.domain.User;

public interface UserService {
    User login(String email, String password);  //encoder
}
