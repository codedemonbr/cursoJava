package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo = false;
    private boolean ligadoAr = false;

    public Ferrari() {
        this(315);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);

    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;

    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;

    }

    @Override
    public String toString() {
        return "Ferrari velocidade " + this.velocidadeAtual;
    }

    @Override
    public void ligarAr() {
        this.ligadoAr = true;
    }

    @Override
    public void desligarAr() {
        ligadoAr = false;
    }

    @Override
    public int getDelta() {
        if (ligarTurbo && !ligadoAr) {
            return 35;
        } else if (ligadoAr && ligarTurbo) {
            return 30;
        } else if (!ligadoAr && ligarTurbo) {
            return 20;
        }
        return 15;
    }

}
