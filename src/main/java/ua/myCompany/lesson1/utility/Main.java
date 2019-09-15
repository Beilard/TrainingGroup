package ua.myCompany.lesson1.utility;

public class Main {
    public static void main(String[] args) {
        Factorial fac = new Factorial();
        Fibonacci fib = new Fibonacci();
        System.out.println("Fibonacci: " + fib.fibonacci(10));
        System.out.println("Factorial: " + fac.factorial(10));
    }
}
