package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!!");

        Produto p1 = new Produto("Caneta", 6.5, 0.09);
        Produto p2 = new Produto("Borracha", 2.1, 0.1);
        Produto p3 = new Produto("Notebook", 2500.0, 0.12);
        Produto p4 = new Produto("Caderno", 20, 0.08);
        Produto p5 = new Produto("Lapis", 2.0, 0.06);
        Produto p6 = new Produto("Apontador", 1.5, 0.03);

        imprimir.accept(p1);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);

        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println );

    }
}
