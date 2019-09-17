package ua.myCompany.lessons.lesson3.inheritance;

public class Main {
    public static void main(String[] args) {
       User user = new User.Builder()
                .withName("Ivan")
                .withSurname("Ivanov")
                .withPassword("password")
                .build();
    }
}
