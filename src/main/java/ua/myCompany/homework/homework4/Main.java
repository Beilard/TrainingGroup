package ua.myCompany.homework.homework4;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        ArrayMaster master = new ArrayMaster();

        User andrey = director.createAndrey();
        User vlad = director.createVlad();

        master.addStudent(andrey);
        master.addStudent(vlad);

        master.printAllFacultiesStudents();
        master.printAllGroupsStudents();
        master.printBornAfterYear(1994);
    }
}
