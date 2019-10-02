package ua.myCompany.consoleApplication;

import ua.myCompany.consoleApplication.domain.Student;
import ua.myCompany.consoleApplication.repository.StudentRepositoryImpl;
import ua.myCompany.consoleApplication.service.PasswordEncoder;
import ua.myCompany.consoleApplication.service.StudentServiceImpl;
import ua.myCompany.consoleApplication.validator.StudentValidator;

import java.util.Scanner;

public class Menu {
    //initialisation of everything + method + init students
    StudentServiceImpl userCommands = new StudentServiceImpl(new StudentRepositoryImpl(),
            new StudentValidator(), new PasswordEncoder());
    public static Scanner scanner = new Scanner(System.in);

    public void run(){
        System.out.println("Greetings! \n To register, enter your email:");
        String email = scanner.nextLine();
        System.out.println("Great! Now enter your password: ");
        String password = scanner.nextLine();
        userCommands.register(Student.builder().setEmail(email).setPassword(password).build());
        System.out.println("To login enter your email and then password:");
        userCommands.login(scanner.nextLine(), scanner.nextLine());
        System.out.println("Success!");
    }
}
