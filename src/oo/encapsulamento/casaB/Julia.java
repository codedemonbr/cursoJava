package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

    void testeAcesso() {
        Ana sogra = new Ana();
        // System.out.println(sogra.segredo); invisivel pq é privado
        // System.out.println(sogra.facoDentroDeCasa);
        // System.out.println(sogra.formaDeFalar);
        System.out.println(sogra.todosSabem);
        
    }

}
