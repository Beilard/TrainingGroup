package ua.myCompany.homework.homework3.lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isFactor = (n, d) -> (n % d) == 0;

        int num1 = 10;
        int num2 = 4;
        System.out.println(isFactor.test(num1, num2) ? (num1 + " является делителем " + num2)
                : ((num1 + " не является делителем " + num2)));

        NumericTest isLess = (n, d) -> (n < d);
        System.out.println(isLess.test(num1,num2) ? "Less" : "Not less");

        NumericTest isEqual = (n, d) -> (n == d);

        System.out.println(isEqual.test(num1, num2) ? "Equal" : "Not equal");
    }

}
