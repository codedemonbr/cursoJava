package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (n1, n2) -> (n2 + n1) / 2;
        System.out.println(media.apply(8.9, 5.9));

        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double notaFinal = media.apply(n1, n2);
            return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };

        System.out.println(resultado.apply(9.7, 5.1));

        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(media.andThen(conceito).apply(9.7, 4.1));
    }
}
