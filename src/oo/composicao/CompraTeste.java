package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
	
		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
		compra1.adicionarItem(new Item("Caneta", 10, 6));
		compra1.adicionarItem("Borrocha", 12, 2.5);
		compra1.adicionarItem(new Item("Lápis", 8, 2));
		System.out.println(compra1);

		System.out.println(compra1.obterValorTotal());

	}

}
