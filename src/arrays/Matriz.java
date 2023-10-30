package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos alunos? ");
		int qtdeAlunos = entrada.nextInt();

		System.out.println("Quantas notas?");
		int qtdeNotas = entrada.nextInt();

		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];

		double total = 0;
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {

				System.out.printf("Informe a nota %d do aluno %d: ", j + 1, i + 1);
				notasDaTurma[i][j] = entrada.nextDouble();
				total += notasDaTurma[i][j];
			}
		}

		double media = total / (qtdeAlunos * qtdeNotas);

		System.out.println(media);

		for (double[] notasAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasAluno));
		}
		entrada.close();
	}

}
