package ua.myCompany.lessons.lesson6.task4;

import ua.myCompany.lessons.lesson6.task4.repository.StudentRepo;
import ua.myCompany.lessons.lesson6.task4.service.StudentServiceImpl;

public class Menu {
    //initialisation of everything + method + init students
    StudentRepo container = new StudentRepo();
    StudentServiceImpl userCommands = new StudentServiceImpl(container);

    public void run(){
//        what to do
    }
}
