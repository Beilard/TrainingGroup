package ua.myCompany.homework.homework4;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
                .setAddress(new Address("London", 10))
                .setName("Ivan")
                .setSurname("Boborov")
                .create();
        System.out.println(user.toString());
    }
}
