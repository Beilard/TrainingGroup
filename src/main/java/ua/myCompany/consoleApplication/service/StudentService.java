package ua.myCompany.consoleApplication.service;

import ua.myCompany.consoleApplication.domain.Student;

import java.util.Map;

public interface StudentService {
    Student register(Student student);
    Student login (String email, String password);

    Map<Long, Student> findAllUsers ();
}
