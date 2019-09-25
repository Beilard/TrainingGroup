package ua.myCompany.lessons.lesson6.task4.service;

import ua.myCompany.lessons.lesson6.task4.domain.Student;
import ua.myCompany.lessons.lesson6.task4.repository.StudentRepo;

public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public Student register(Student student) {
        if(student ==null) {
            throw new IllegalArgumentException("");
        }
        return studentRepo.save(student);
    }
}
