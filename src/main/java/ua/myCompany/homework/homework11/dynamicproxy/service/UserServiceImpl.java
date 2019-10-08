package ua.myCompany.homework.homework11.dynamicproxy.service;

import ua.myCompany.homework.homework11.dynamicproxy.excpetion.EntityNotFoundException;
import ua.myCompany.lessons.lesson11.example.com.univer.domain.User;

public class UserServiceImpl implements UserService {
    @Override
    public User findById(Long id) {
        if (id == 1) {
            return new User();
        }
        throw new EntityNotFoundException();

    }
}
