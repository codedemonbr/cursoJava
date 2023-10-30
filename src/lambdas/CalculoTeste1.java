package lambdas;

public class CalculoTeste1 {
  public static void main(String[] args) {
    Calculo calculo = new Somar();
    System.out.println("soma" + calculo.executar(2, 5));

    calculo = new Multiplicar();
    System.out.println("multicação " + calculo.executar(2, 5));

  }
}
