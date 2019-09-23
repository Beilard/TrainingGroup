package ua.myCompany.homework.homework4;

import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayMasterTest {

    ArrayMaster instance1 = ArrayMaster.getInstance();

    @After
    public void cleanUp() {
        instance1.reset();
    }

    @Test
    public void getInstance_shouldHaveNormalBehaviour() {
        ArrayMaster instance2 = ArrayMaster.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    public void getInstance_NoNullCheck() {
        assertNotNull(instance1);

    }
    @Ignore
    @Test
    public void addStudent_shouldHaveNormalBehaviour() {
        User user1 = new User.Builder()
                .setName("Ivan")
                .setSurname("Popov")
                .setSecondName("Ivanovich")
                .create();
        instance1.addStudent(user1);
        User user2 = new User("Ivan", "Popov", "Ivanovich");


    }

    @Test
    public void printFacultyMembers_shouldHaveNormalBehaviour() {
        String facultyName = "Java";
        User ivan = new User.Builder().setName("Ivan").setFaculty(facultyName).setGroup(1).create();
        instance1.addStudent(ivan);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        instance1.printFacultyMembers("Java");
        String expectedOutput = "List of students at the " + facultyName + " faculty\r\n" + ivan.toString() + "\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void printAllFacultiesStudents_shouldHaveNormalBehaviour() {
        User ivan = new User.Builder().setName("Ivan").setFaculty("Java").setGroup(1).create();
        instance1.addStudent(ivan);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        instance1.printAllFacultiesStudents();
        String expectedOutput = "Students of the Java faculty:\r\n" + ivan.toString() + "\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void printAllGroupsStudents_shouldHaveNormalBehaviour() {
        int groupNumber = 1;
        User ivan = new User.Builder().setName("Ivan").setFaculty("Java").setGroup(groupNumber).create();
        instance1.addStudent(ivan);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        instance1.printAllGroupsStudents();
        String expectedOutput = "Students of the group #" +groupNumber+ ":\r\n" + ivan.toString() + "\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void printBornAfterYear_shouldHaveNormalBehaviour() {
        String year = "1995";
        int pivotYear = 1994;
        User ivan = new User.Builder().setName("Ivan").setFaculty("Java").setDateOfBirth(year).create();
        instance1.addStudent(ivan);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        instance1.printBornAfterYear(pivotYear);
        String expectedOutput = "List of students born after " + pivotYear + ":\r\n" + ivan.toString() + "\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}