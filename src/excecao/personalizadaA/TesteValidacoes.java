package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {

		try {
			Aluno aluno = new Aluno("Pedro", 6);
			Validar.aluno(aluno);

			Validar.aluno(null);
		} catch (StringVaziaException | NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("deu ilegal " + e.getMessage());
		}

		System.out.println("Fim :)");

	}

}
