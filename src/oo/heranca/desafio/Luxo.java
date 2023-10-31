package oo.heranca.desafio;

public interface Luxo {
    // todo metodo
    // em interface são public
    void ligarAr();

    void desligarAr();

    default int velocidadeDoAr() {
        return 1;
    }
}
