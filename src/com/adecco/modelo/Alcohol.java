package com.adecco.modelo;

public class Alcohol extends Bebida{
    private int grados;

    @Override
    public String toString() {
        return "Alcohol{" +
                "grados=" + grados +
                "} " + super.toString();
    }

    public Alcohol() {
    }

    public Alcohol(String nombre, String marca, double precio, int grados) {
        super(nombre, marca, precio);
        this.grados = grados;
    }

    public int getGrados() {
        return grados;
    }

    public void setGrados(int grados) {
        this.grados = grados;
    }
}
