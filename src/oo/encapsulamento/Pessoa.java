package oo.encapsulamento;

public class Pessoa {
    private String nome;

    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(int idade) {
        setIdade(idade);
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade < 130) {
            this.idade = novaIdade;
        }
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    }

}
