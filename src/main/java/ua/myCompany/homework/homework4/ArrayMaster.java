package ua.myCompany.homework.homework4;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 * Создать массив объектов. Вывести:
 * a) список студентов заданного факультета;
 * b) списки студентов для каждого факультета и курса;
 * c) список студентов, родившихся после заданного года;
 * d) список учебной группы.
 */

public class ArrayMaster {
    private ArrayList<User> array = new ArrayList<>(10);
    private LinkedHashSet<String> facultySet = new LinkedHashSet<>();
    private LinkedHashSet<Integer> groupSet = new LinkedHashSet<>();

    public void addStudent(User student) {
        array.add(student);
        groupSet.add(student.getGroup());
        if (student.getFaculty() != null) {
            facultySet.add(student.getFaculty());
        }
    }

    public void printFacultyMembers(String faculty) {
        System.out.println("List of students at the " + faculty + " faculty");
        for (User u : array) {
            if (u.getFaculty().equals(faculty)) {
                System.out.println(u.toString());
            }
        }
    }

    public void printAllFacultiesStudents() {
        for (String s : facultySet) {
            System.out.println("Students of the " + s + " faculty:");
            for (User u : array) {
                if (u.getFaculty().equals(s)) {
                    System.out.println(u.toString());
                }
            }
        }
    }
}
