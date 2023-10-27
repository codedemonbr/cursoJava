package oo.composicao.desafio;

public class Item {

	final int qtde ;

	 final Produto produto ;
	
	Item(Produto produto, int quantidade){
		this.produto = produto;
		this.qtde = quantidade;
	}
	
	
	
	double valorTotalItem() {
		return (double) qtde * produto.preco;
	}

}
