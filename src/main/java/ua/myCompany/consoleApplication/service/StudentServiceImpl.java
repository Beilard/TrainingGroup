package ua.myCompany.consoleApplication.service;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import ua.myCompany.consoleApplication.domain.Student;
import ua.myCompany.consoleApplication.repository.StudentRepository;
import ua.myCompany.consoleApplication.validator.StudentValidator;
import ua.myCompany.lessons.lesson9.example3.exceptions.EntityNotFoundException;

import java.util.Map;


public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final StudentValidator studentValidator;
    private final PasswordEncoder passwordEncoder;
    private static final org.apache.log4j.Logger logger = Logger.getLogger(StudentServiceImpl.class.toString());


    public StudentServiceImpl(StudentRepository studentRepository,
                           StudentValidator studentValidator,
                           PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        this.studentRepository = studentRepository;
        this.studentValidator = studentValidator;
    }

    @Override
    public Student register(Student student) {
        logger.info("Start of the registration log");
        logger.debug("Student ID and email" + student.getId() + student.getEmail());
        studentValidator.validate(student);
        String password = student.getPassword();
        String encodePassword = passwordEncoder.encode(password);
        return studentRepository.save(student);
        //create studentForm, encode the password and use mapper + tests.
    }

    @Override
    public Student login(String email, String password) {
        String encodePassword = passwordEncoder.encode(password);
        Student user = studentRepository.findByEmail(email).orElseThrow(() ->
                new EntityNotFoundException("Wrong email or password"));
        String userPassword = user.getPassword();
        if (userPassword.equals(password)) {
            return user;
        }
        throw new EntityNotFoundException("Wrong email or password"); //same message
    }

    @Override
    public Map<Long, Student> findAllUsers() {
        return null;
    }

}
