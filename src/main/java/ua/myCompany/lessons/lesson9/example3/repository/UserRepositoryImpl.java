package ua.myCompany.lessons.lesson9.example3.repository;

import ua.myCompany.lessons.lesson9.example3.domain.User;

import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository{
    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public Optional<User> findById(Long Id) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User> findByName(String name) {
        return null;
    }

    @Override
    public Optional<User> findEmail(User user) {
        return Optional.empty();
    }
}
