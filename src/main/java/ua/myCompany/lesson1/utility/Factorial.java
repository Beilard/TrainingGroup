package ua.myCompany.lesson1.utility;

import java.math.BigInteger;

public class Factorial implements IFactorial {
    public int factorial(int num) {
        return (num == 0) ? 1 : num * factorial(num - 1);
    }

    public BigInteger factorialBig(int big) {
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i < big; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
