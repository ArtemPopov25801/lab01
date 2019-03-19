package calculator;

public class Calculator {

    public static double plus(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("На ноль делить нельзя");
        } else {
            return a / b;
        }
        return 0;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            //System.out.println("На ноль делить нельзя!");
            throw new RuntimeException("На ноль делить нельзя!");
        }
        return a / b;
    }

}
