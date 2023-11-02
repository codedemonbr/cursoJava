package streams;

public class MediaTeste {
    public static void main(String[] args) {

        Media m1 = new Media().adicionar(10).adicionar(9);

        Media m2 = new Media().adicionar(6).adicionar(7);

        System.out.println(m1.getValor());
        System.out.println(m2.getValor());
        System.out.println(Media.combinar(m1, m2).getValor());

    }
}
