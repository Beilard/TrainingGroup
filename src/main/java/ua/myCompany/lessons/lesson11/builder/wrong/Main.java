package ua.myCompany.lessons.lesson11.builder.wrong;

public class Main {
    public static void main(String[] args) {
        new Student.StudentBuilder()
                .withName("Alex")
                .builder();
    }
}
