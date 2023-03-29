package com.adecco.presentacion;

import com.adecco.modelo.Agua;
import com.adecco.modelo.Bebida;
import com.adecco.modelo.Gaseosa;

public class Main {
    public static void main(String[] args) {
        Bebida a1=new Agua("Agua mineral","Bezoya",3,"España");
        System.out.println(a1);
        Agua a2= (Agua) a1;
        a2.setOrigen("Sierra Nevada");
        System.out.println(a2);

        Bebida g1=new Gaseosa("Refresco","Coca-cola", 1, 0.005);
//pasa tiempo y quiero modificar un dato.
        Gaseosa g2= (Gaseosa) g1;
        g2.setCantidadAzucar(0.5);
        System.out.println(g1);
        System.out.println(g2); //sale lo mismo que el otro porque se ha hecho casting

    }
}