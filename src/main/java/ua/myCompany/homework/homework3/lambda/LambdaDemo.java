package ua.myCompany.homework.homework3.lambda;

public class LambdaDemo {

    public static void main(String[] args) {
        MyValue myVal = () -> 98.6;

        MyParamValue myParamValue = (n) -> 1.0 / n;

        System.out.println("Constant: " + myVal.getValue());
        System.out.println("Inverse: " + myParamValue.getValue(4.0));
    }


}
