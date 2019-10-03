package ua.myCompany.homework.homework9.prototype;

public class Main {
    public static void main(String[] args) {
        Address firstAddress = new Address("Kiev", 179);

        User first = new User(firstAddress, "Vasya", "Popov");

        User second = first.clone();
        System.out.println(first == second);
        System.out.println(first.equals(second));
    }


}
