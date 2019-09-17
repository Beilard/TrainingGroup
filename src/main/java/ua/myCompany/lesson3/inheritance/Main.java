package ua.myCompany.lesson3.inheritance;
import ua.myCompany.lesson3.inheritance.User;
public class Main {
    public static void main(String[] args) {
       User user = new User.Builder()
                .withName("Ivan")
                .withSurname("Ivanov")
                .withPassword("password")
                .build();
    }
}
