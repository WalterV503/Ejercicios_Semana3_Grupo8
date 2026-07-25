package com.sv.grupo8.ejercicio17;

public class Articulo {

    protected int id;
    protected String descripcion;
    protected double precioBase;

    public Articulo(int id, String descripcion, double precioBase) {
        this.id = id;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
    }

    public void mostrarFicha() {
        System.out.println("ID: " + id);
        System.out.println("Precio: $" + precioBase);
    }
}
