package ua.myCompany.lessons.lesson6.task4.service;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import ua.myCompany.lessons.lesson6.task4.domain.Student;
import ua.myCompany.lessons.lesson6.task4.repository.StudentRepo;

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

    private StudentRepo studentRepo = Mockito.mock(StudentRepo.class);
    private StudentServiceImpl studentInterface = new StudentServiceImpl(studentRepo);

    @After
    public void resetMock(){
        Mockito.reset(studentRepo);
    }

    @Test
    public void test1(){
        Student student = Student.builder().setId(1).build();
        Mockito.when(studentRepo.save(any(Student.class))).thenReturn(student);
        Student student1 = studentInterface.register(student);
        assertNotNull(student1);
    }

    public void test2(){

    }
}