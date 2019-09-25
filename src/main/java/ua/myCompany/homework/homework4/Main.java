package ua.myCompany.homework.homework4;

public class Main {
    public static void main(String[] args) {
        Master master = Master.getInstance();

        User andrey = Director.createAndrey();
        User vlad = Director.createVlad();

        master.addStudent(andrey);
        master.addStudent(vlad);

        master.printAllFacultiesStudents();
        master.printAllGroupsStudents();
        master.printBornAfterYear(1994);
    }
}
