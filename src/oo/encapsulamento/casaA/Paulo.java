package oo.encapsulamento.casaA;

public class Paulo {
    Ana esposa = new Ana();

    void testeAcesso() {
        // System.out.println(esposa.segredo); invisivel pq é privado
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    }
}
