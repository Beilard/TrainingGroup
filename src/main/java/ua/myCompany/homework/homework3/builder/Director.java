package ua.myCompany.homework.homework3.builder;

public class Director {
    public void constructRegularJoe(Builder builder) {
        builder.setName("John");
        builder.setSurname("Doe");
        builder.setEmail("johndoe@outlook.com");
        builder.setPassword("qwerty1234");
    }

    public void constructMadHacker(Builder builder) {
        builder.setName("Eliot");
        builder.setSurname("Alderson");
        builder.setEmail("mrrobot@gmail.com");
        builder.setPassword("fsociety57");
        builder.setCode(1337);
    }

}
