package ua.myCompany.lessons.lesson11.example.com.univer.repository;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<E> {
    E save(E item);

    //select * from E where id = id;
    Optional<E> findById(Long id);

    List<E> findAll();

    void update(E item);

    boolean deleteById(Long id); //optional with empty


}
