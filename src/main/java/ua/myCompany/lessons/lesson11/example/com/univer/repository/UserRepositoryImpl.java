package ua.myCompany.lessons.lesson11.example.com.univer.repository;

import ua.myCompany.lessons.lesson11.example.com.univer.domain.User;

import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public User save(User item) { //check role through enum
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void update(User item) {

    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
