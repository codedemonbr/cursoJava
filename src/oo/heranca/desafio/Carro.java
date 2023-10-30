package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual;
    private int delta = 5;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if (this.velocidadeAtual + getDelta() <= VELOCIDADE_MAXIMA) {
            this.velocidadeAtual += getDelta();
        }
    }

    public void frear() {
        if (this.velocidadeAtual >= 0) {
            this.velocidadeAtual -= getDelta();
        }
    }
}
