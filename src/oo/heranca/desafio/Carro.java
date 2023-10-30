package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    int delta = 5;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if (this.velocidadeAtual + delta <= VELOCIDADE_MAXIMA) {
            this.velocidadeAtual += delta;
        }
    }

    public void frear() {
        if (this.velocidadeAtual >= 0) {
            this.velocidadeAtual -= delta;
        }
    }
}
