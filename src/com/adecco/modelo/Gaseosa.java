package com.adecco.modelo;

public class Gaseosa extends Bebida{
    private double cantidadAzucar;


    @Override
    public String toString() {
        return "Gaseosa{" +
                "cantidadAzucar=" + cantidadAzucar +
                "} " + super.toString();
    }



    public Gaseosa() {
    }
    public Gaseosa(String nombre, String marca, double precio, double cantidadAzucar) {
        super(nombre, marca, precio);
        this.cantidadAzucar = cantidadAzucar;
    }



    public double getCantidadAzucar() {
        return cantidadAzucar;
    }
    public void setCantidadAzucar(double cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }
}
