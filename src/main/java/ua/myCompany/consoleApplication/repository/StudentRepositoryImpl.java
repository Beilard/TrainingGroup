package ua.myCompany.consoleApplication.repository;

import ua.myCompany.consoleApplication.domain.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class StudentRepositoryImpl implements StudentRepository {
    private Map<Long, Student> idToStudents = new HashMap<>();
    private static Long counter = 0L;


    @Override
    public Student save(Student student) {
        return idToStudents.put(++counter, student);
    }

    @Override
    public Student findById(Long id) {
        return idToStudents.get(id);
    }

    @Override
    public void update(Student student) {
        if (Objects.isNull(student)) {
            throw new IllegalArgumentException("Null is not accepted");
        }
        idToStudents.forEach((k, v) -> {
            if (v.equals(student)) {
                v = student;
            }
        });
    }

    @Override
    public Student deleteById(Long id) {
        return idToStudents.remove(id);
    }

    @Override
    public Optional<Student> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public Map<Long, Student> findAll() {
        return idToStudents;
    }
}
