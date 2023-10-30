package metodosClassses;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 1000);

		var p2 = new Produto();
		p2.nome = "caneta azul";
		p2.preco = 10;

		// Produto.desconto = 0.3;

		System.out.println(p1.nome);
		System.out.println(p2.nome);

		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

		System.out.println(precoFinal1);
		System.out.println(precoFinal2);

		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);

	}

}
