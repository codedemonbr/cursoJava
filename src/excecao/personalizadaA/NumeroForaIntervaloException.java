package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {
    private String nomeDoAtributo;

    public NumeroForaIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo '%s' está fora de intervalo", nomeDoAtributo);
    }

}
