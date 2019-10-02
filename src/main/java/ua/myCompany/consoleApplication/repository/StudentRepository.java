package ua.myCompany.consoleApplication.repository;

import ua.myCompany.consoleApplication.domain.Student;

import java.util.Map;
import java.util.Optional;

//crud
//create
//read
//update
//delete
public interface StudentRepository {
    //C
    Student save(Student student);
    //R
    Student findById(Long id);
    Optional<Student> findByEmail(String email);
    Map<Long, Student> findAll();
    //U
    void update (Student student);
    //D
    Student deleteById(Long id);

}
