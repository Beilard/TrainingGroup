package ua.myCompany.lessons.lesson9.example3.repository;

import ua.myCompany.lessons.lesson9.example3.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);

    Optional<User> findById(Long Id);

    //if no users return emptyList;
    List<User> findAll();

    List <User> findByName(String name);

    Optional<User> findEmail(String email);
}
