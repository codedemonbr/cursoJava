package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        BinaryOperator<Double> calc = (x, y) -> x + y;
        System.out.println(calc.apply((double) 2, (double) 3));

        calc = (a, b) -> a * b;

        System.out.println(calc.apply(2.0, 3.0));

        BinaryOperator<Integer> calc1 = (x, y) -> x + y;
        System.out.println(calc1.apply(2,  3));

        calc = (a, b) -> a * b;

        System.out.println(calc1.apply(2, 3));
    }
}
