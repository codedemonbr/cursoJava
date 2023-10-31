package lambdas;

public class CalculoTeste2 {
  public static void main(String[] args) {
    Calculo calc = (x, y) -> x + y;

    System.out.println(" soma " + calc.executar(4, 5));

    calc = (a, b) -> a * b;
    System.out.println(" multiplicação " + calc.executar(4, 5));

    System.out.println(calc.legal());

    System.out.println(Calculo.muitoLegal());
  }
}
