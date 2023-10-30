package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {
        Carro civic = new Civic();
        // System.out.println(civic.velocidadeAtual);

        civic.acelerar();
        // System.out.println(civic.velocidadeAtual);
        System.out.println(civic);

        Carro ferrari = new Ferrari(400);
        ferrari.acelerar();

        ferrari.frear();

        // System.out.println("Velocidade da Ferrari " + ferrari.velocidadeAtual);

        System.out.println(ferrari);
    }
}
