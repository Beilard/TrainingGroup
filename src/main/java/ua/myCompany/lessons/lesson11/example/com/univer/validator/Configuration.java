package ua.myCompany.lessons.lesson11.example.com.univer.validator;

import org.springframework.context.annotation.Bean;
import ua.myCompany.lessons.lesson11.example.com.univer.repository.UserRepository;
import ua.myCompany.lessons.lesson11.example.com.univer.service.UserService;
import ua.myCompany.lessons.lesson11.example.com.univer.service.UserServiceImpl;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public UserService userService(UserRepository  userRepository) {
        return new UserServiceImpl(userRepository, (user) -> {
            if (user == null) {
                throw new RuntimeException();
            }
        }, (password) -> {
        });
    }

    public Validator<String> passwordValidator() {
        return new PasswordValidator();
    }
}

