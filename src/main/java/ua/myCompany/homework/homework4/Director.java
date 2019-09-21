package ua.myCompany.homework.homework4;

public class Director {
    public User createAndrey() {
        return new User.Builder()
                .setName("Andrii")
                .setSurname("Shylin")
                .setDateOfBirth("01.01.1990")
                .setFaculty("Java")
                .setGroup(1)
                .create();
    }

    public User createVlad() {
        return new User.Builder()
                .setName("Vlad")
                .setSurname("Khurtin")
                .setDateOfBirth("17.02.1995")
                .setGroup(2)
                .setFaculty("Java")
                .create();
    }
}
