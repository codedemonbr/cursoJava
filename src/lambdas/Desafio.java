package lambdas;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("iPad", 3000, 0.1);

        Function<Produto, Double> precoLiquido = (produto) -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> precoTributado = (preco) -> preco >= 2500 ? preco * (1 + 0.085) : preco;
        UnaryOperator<Double> freteAdicionado = (preco) -> preco >= 3000 ? preco + 100 : preco + 50;
        Function<Double, String> duasCasasDecimais = (preco) -> new DecimalFormat("#,##0.00").format(preco);
        UnaryOperator<String> comCifrao = preco -> "R$ " + preco;

        System.out.println(
                precoLiquido.andThen(precoTributado).andThen(freteAdicionado).andThen(duasCasasDecimais)
                        .andThen(comCifrao).apply(p));
    }
}
