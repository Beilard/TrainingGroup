package ua.myCompany.lessons.lesson6.task4.service;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import ua.myCompany.consoleApplication.domain.Student;
import ua.myCompany.consoleApplication.repository.StudentRepositoryImpl;
import ua.myCompany.consoleApplication.service.PasswordEncoder;
import ua.myCompany.consoleApplication.service.StudentServiceImpl;
import ua.myCompany.consoleApplication.validator.StudentValidator;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;

@RunWith(MockitoJUnitRunner.class)
public class StudentServiceImplTest {
//    private StudentRepo studentRepo = new StudentRepo();
//    private StudentInterfaceImpl studentService = new StudentInterfaceImpl();
//
//    @Override
//    public Student findById(){
//
//    }

    private StudentRepositoryImpl studentRepositoryImpl = Mockito.mock(StudentRepositoryImpl.class);
    private StudentValidator studentValidator= new StudentValidator();
    private PasswordEncoder passwordEncoder = new PasswordEncoder();
    private StudentServiceImpl studentInterface = new StudentServiceImpl(studentRepositoryImpl,
            studentValidator, passwordEncoder);


    @After
    public void resetMock(){
        Mockito.reset(studentRepositoryImpl);
    }

    @Test
    public void test1(){
        Student student = Student.builder().setId(1).build();
        Mockito.when(studentRepositoryImpl.save(any(Student.class))).thenReturn(student);
        Student student1 = studentInterface.register(student);
        assertNotNull(student1);
    }

    public void test2(){

    }
}