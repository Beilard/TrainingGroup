package ua.myCompany.homework.homework4;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 * Holds the array of users and provides the tools to manage it. Is a thread-safe singleton.
 * Method facultySet and groupSet contain unique faculty and group labels respectively.
 * Method addStudent adds the passed user to the main array;
 * Method printFacultyMembers prints the users of the passed faculty.
 * Methods printAllFacultiesStudents and printAllGroupsStudents print users from all faculties and groups respectively.
 * Methods printBornAfterYear displays users born after the passed year.
 */

public class ArrayMaster {
    private static ArrayMaster instance;
    private ArrayList<User> array = new ArrayList<>(10);
    private LinkedHashSet<String> facultySet = new LinkedHashSet<>();
    private LinkedHashSet<Integer> groupSet = new LinkedHashSet<>();

    private ArrayMaster(){}

    public static ArrayMaster getInstance(){
        if (instance == null){
            synchronized (ArrayMaster.class) {
                if (instance == null) {
                    instance = new ArrayMaster();
                }
            }
        }
        return instance;
    }

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

    public void printAllGroupsStudents() {
        for (Integer s : groupSet) {
            System.out.println("Students of the group #" + s + ":");
            for (User u : array) {
                if (u.getGroup() == s) {
                    System.out.println(u.toString());
                }
            }
        }
    }

    public void printBornAfterYear(int year) {
        System.out.println("List of students born after " + year + ":");
        for (User u : array) {
            String temp = u.getDateOfBirth();
            int givenYear = Integer.parseInt(temp.substring(temp.length() - 4));
            if (givenYear > year) {
                System.out.println(u.toString());
            }
        }
    }
}
