package ua.myCompany.lessons.lesson5.inner.classes;

import java.util.HashMap;
import java.util.Map;

public class Calc {
    //enum
    private interface Calculation {
        int calc(int arg1, int arg2);
    }

    private static final Map<String, Calculation> OPERATION_FOR_CALCULATION = new HashMap<>();

    static {
        OPERATION_FOR_CALCULATION.put("+", (a, b) -> a + b);
        OPERATION_FOR_CALCULATION.put("-", (a, b) -> a - b);
    }

    public int CalcOperation(int arg1, String operation, int arg2) {
        return  OPERATION_FOR_CALCULATION.get(operation).calc(arg1, arg2);
    }

}
