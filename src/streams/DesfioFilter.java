package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesfioFilter {
    public static void main(String[] args) {
        Produto p1 = new Produto("calculadora", 0.2, 20);
        Produto p2 = new Produto("batata", 0.1, 5);
        Produto p3 = new Produto("tesoura", 0.3, 10);
        Produto p4 = new Produto("celular", 0.4, 2000);
        Produto p5 = new Produto("tenis", 0.2, 150);
        Produto p6 = new Produto("microfone", 0.35, 200);
        Produto p7 = new Produto("processador", 0.23, 600);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        Predicate<Produto> liquidacao = (p) -> p.desconto >= 0.2;
        Predicate<Produto> maiorEconomia = (p) -> p.preco * (1 - p.desconto) > 150;
        Function<Produto, String> mensagemFinal = p -> "Você vai economizar mais comprando " + p.nome;

        produtos.stream().filter(liquidacao).filter(maiorEconomia).map(mensagemFinal).forEach(System.out::println);

    }
}
