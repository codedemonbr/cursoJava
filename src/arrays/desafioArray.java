package arrays;

import java.util.Scanner;

public class desafioArray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Quantidade de notas: ");
		int qtdeNotas = in.nextInt();

		double notas[] = new double[qtdeNotas];

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Nota [" + i + "] ");
			notas[i] = in.nextDouble();
		}
		in.close();

		double total = 0;
		for (double nota : notas) {
			total += nota;
		}

		double media = total / notas.length;

		System.out.println(media);

	}

}
