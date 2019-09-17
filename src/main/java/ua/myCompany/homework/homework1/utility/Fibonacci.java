package ua.myCompany.homework.homework1.utility;

import java.math.BigInteger;

public class Fibonacci {
    public static BigInteger fibonacci(int number) {
        BigInteger num1 = new BigInteger("1");
        BigInteger num2 = new BigInteger("1");
        BigInteger num3;

        if (number <= 0) {
            return BigInteger.valueOf(number);
        }

        for (int i = 2; i < number; i++) {
            num3 = num1.add(num2);
            num1 = num2;
            num2 = num3;
        }
        return num2;
    }

    public static int fibonacciRec(int num) {
        return (num <= 1) ? num : (fibonacciRec(num - 1) + fibonacciRec(num - 2));
    }

}
