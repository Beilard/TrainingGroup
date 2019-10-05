package ua.myCompany.lessons.lesson11.example.com.univer.service;

import org.springframework.stereotype.Component;
import ua.myCompany.lessons.lesson11.example.com.univer.domain.User;
import ua.myCompany.lessons.lesson11.example.com.univer.repository.UserRepository;
import ua.myCompany.lessons.lesson11.example.com.univer.validator.PasswordValidator;
import ua.myCompany.lessons.lesson11.example.com.univer.validator.Validator;

@Component
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository; //validation

    private final Validator<User> userValidator;

    private final Validator<String> passwordValidator;

    public UserServiceImpl(UserRepository userRepository,
                           Validator<User> userValidator,
                           Validator<String> passwordValidator) {
        this.userRepository = userRepository;
        this.userValidator = userValidator;
        this.passwordValidator = passwordValidator;
    }

    @Override
    public User login(String email, String password) {
        return null;
    }
}
