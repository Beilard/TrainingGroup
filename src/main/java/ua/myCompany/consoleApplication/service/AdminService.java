package ua.myCompany.consoleApplication.service;

import ua.myCompany.consoleApplication.domain.Student;

public interface AdminService {
    Student expelStudent(long id, Student student);
}
