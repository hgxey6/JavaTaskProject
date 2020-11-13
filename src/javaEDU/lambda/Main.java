package javaEDU.lambda;

public class Main {
    public static void main(String[] args) {
        // Без лямбда
        Operation operation = new Operation() {
            @Override
            public double getResult(double v1, double v2, double v3) {
                return v1 * v2 + v3;
            }
        };
        System.out.println(operation.getResult(1.0, 2, 4));


        // Лямбда
        Operation lambda = (v1, v2, v3) -> v1 * v2 + v3;
        System.out.println(lambda.getResult(1.0, 2, 4));

        // Блочный лямбда
        Factorial factorial = value -> {
            int result = 1;
            for (int i = value; i > 1; i --) {
                result *= i;
            }

            return result;
        };

        System.out.println(factorial.getResult(5));
    }

}
