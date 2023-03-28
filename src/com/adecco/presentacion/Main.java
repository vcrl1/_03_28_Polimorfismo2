package com.adecco.presentacion;

import com.adecco.modelo.Agua;
import com.adecco.modelo.Bebida;

public class Main {
    public static void main(String[] args) {
        Bebida a1=new Agua("Agua mineral","Bezoya",3,"España");
        System.out.println(a1);
        Agua a2= (Agua) a1;
        a2.setOrigen("Sierra Nevada");
        System.out.println(a2.getOrigen());

    }
}