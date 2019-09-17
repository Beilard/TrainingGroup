package ua.myCompany.lesson3.lambda;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    Map<String, CalcInterface> operator = new HashMap<>();
    {
        operator.put("+", (a,b) -> a + b );
        operator.put("-", (a,b) -> a - b );
        operator.put("*", (a,b) -> a * b );
        operator.put("/", (a,b) -> a / b );
    }
//
//    public int calc(int arg1, String operator, int arg2) {
//       // return operator.get(operator).calc(arg1, arg2);
//    }
}
