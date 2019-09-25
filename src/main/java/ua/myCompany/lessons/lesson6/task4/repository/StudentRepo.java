package ua.myCompany.lessons.lesson6.task4.repository;

import ua.myCompany.lessons.lesson6.task4.domain.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentRepo implements StudentRepository{
    private Map<Long, Student> idToStudents = new HashMap<>();
    private static Long counter = 0L;


    @Override
    public Student save(Student student) {
        //
        return idToStudents.put(++counter, student);
    }

    @Override
    public Student findById(Long id) {
        return idToStudents.get(id);
    }

    @Override
    public void update(Student student) {
        idToStudents.forEach((k,v) -> {
            if (v.equals(student)) {
                v = student;
            }
        });
    }

    @Override
    public Student deleteById(Long id) {
        return idToStudents.remove(id);
    }
}
