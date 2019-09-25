package ua.myCompany.lessons.lesson6.task4.repository;

import ua.myCompany.lessons.lesson6.task4.domain.Student;

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
    //U
    void update (Student student);
    //D
    Student deleteById(Long id);
}
