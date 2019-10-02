package ua.myCompany.lessons.lesson9.example3.service;

import ua.myCompany.lessons.lesson9.example3.domain.User;
import ua.myCompany.lessons.lesson9.example3.exceptions.EntityNotFoundException;
import ua.myCompany.lessons.lesson9.example3.repository.UserRepository;
import ua.myCompany.lessons.lesson9.example3.validator.UserValidator;

import java.util.List;

//mock all three fields;
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserValidator userValidator;
    private final PasswordEncoder passwordEncoder;

    //@Autowired
    public UserServiceImpl(UserRepository userRepository,
                           UserValidator userValidator,
                           PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.userValidator = userValidator;
    }

    @Override
    public User register(User user) {
        //validate
        userValidator.validate(user);
        //unique email, use regex for email field validation
        String password = user.getPassword();
        String encodePassword = passwordEncoder.encode(password);
        return userRepository.save(user);
        //create UserForm, encode the password and use mapper + tests.
    }

    @Override
    public User login(String login, String password) {
        String encodePassword = passwordEncoder.encode(password);
        User user = userRepository.findEmail(login).orElseThrow(() -> new EntityNotFoundException(" "));
        String userPassword = user.getPassword();
        if (userPassword.equals(password)) {
            return user;
        }
        throw new EntityNotFoundException(" "); //same message
    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }
}
