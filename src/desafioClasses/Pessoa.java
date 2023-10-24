package desafioClasses;

public class Pessoa {
	double peso;
	String nome;

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	void comer(Comida c) {
		if (c != null)
			this.peso = this.peso + c.peso;
	}
}
