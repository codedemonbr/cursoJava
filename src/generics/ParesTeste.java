package generics;

public class ParesTeste {
    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "Pedro");
        resultadoConcurso.adicionar(5, "Arthur");
        resultadoConcurso.adicionar(3, "Joana");
        resultadoConcurso.adicionar(6, "José");
        resultadoConcurso.adicionar(2, "Rosa");
        resultadoConcurso.adicionar(4, "Bombom");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(4));
        System.out.println(resultadoConcurso.getValor(5));
        System.out.println(resultadoConcurso.getValor(2));

        System.out.println(resultadoConcurso);

    }
}
