package ua.myCompany.lessons.lesson2.enums;

public final class Calculator {
    public Calculator() {
        throw new RuntimeException("utility class");
    }

    //
    public static int calc(int arg1, String operator, int arg2) {
//        int result = 0;
        if ("-".equals(operator)) {
            return arg1 - arg2;
        }
        if ("+".equals(operator)) {
            return arg1 + arg2;
        }
        if ("*".equals(operator)) {
            return arg1 * arg2;
        }
        if ("/".equals(operator)) {
            return arg1 / arg2;
        }
        else {
            throw new RuntimeException();
        }
    }

    public static int calc2(int arg1, String operator, int arg2) {
        int result = 0;
        if (operator==null){
            throw new RuntimeException("operator is null");
        }
        switch (operator){
            case "+":
                return arg2 + arg2;
            case "-":
                return arg1 - arg2;
            case "*":
                return arg1 * arg2;
            case "/":
                return arg1 / arg2;
            default:
                throw new RuntimeException();
        }
    }


}
