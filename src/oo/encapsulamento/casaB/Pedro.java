package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    // Ana mae = new Ana(); // Esqueça a composição podemos acessar atributos
    // protected apenas por herança

    void testeAcesso() {
        // System.out.println(segredo);// invisivel pq é privado
        // System.out.println(facoDentroDeCasa);//default não vem por heranca
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
    }
}
