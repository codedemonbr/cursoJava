package desafioClasses;

public class Jantar {
	public static void main(String[] args) {
		Comida feijao = new Comida("feijão", 0.2);
		Comida arroz = new Comida("arroz", 0.150);
		
		Pessoa pedro = new Pessoa("Pedro", 70);
		
		pedro.comer(arroz);
		pedro.comer(feijao);
		
		System.out.println(pedro.nome);
		System.out.println(pedro.peso);
	}
}
