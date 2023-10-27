package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("José");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1, 100);
		compra1.adicionarItem(new Produto("Notebook", 2000), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 1000), 1);
		
		System.out.println(c1.nome);
		System.out.println(c1.obterValorTotal());
		c1.adicionarCompra(compra1);
		c1.adicionarCompra(compra2);
		System.out.println(c1.obterValorTotal());
	}
}
