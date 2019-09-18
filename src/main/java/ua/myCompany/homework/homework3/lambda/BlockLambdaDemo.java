package ua.myCompany.homework.homework3.lambda;

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunction smallestF = (n) -> {
            int result = 1;
            n = n < 0 ? -n : n;
            for (int i = 2; i <= n / i; i++) {
                if ((n % i) == 0) {
                    result = i;
                    break;
                }
            }
            return result;
        };
        System.out.println("Наименьшим делителем является: " + smallestF.func(12));
    }
}
