package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		Jogador j1 = new Monstro();
		j1.x = 10;
		j1.y = 10;

		Jogador j2 = new Heroi(10, 11);

		System.out.println(j1.vida);
		System.out.println(j2.vida);

		j1.atacar(j2);
		j2.atacar(j1);

		System.out.println(j1.vida);
		System.out.println(j2.vida);

	}
}
