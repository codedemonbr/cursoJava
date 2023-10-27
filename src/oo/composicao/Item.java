package oo.composicao;

public class Item {
	String nome;
	int quantidade;
	double preco;
	
	Compra compra;
	
	Item(String nome, int quantidade, double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{ nome = " + this.nome + ", qtde = " + this.quantidade + ", preco = "+ this.preco+ " }";
	}
}
