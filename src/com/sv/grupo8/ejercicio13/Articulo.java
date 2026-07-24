package com.sv.grupo8.ejercicio13;

public class Articulo {

    protected int id;
    protected String descripcion;
    protected double precioBase;

    public Articulo(int id, String descripcion, double precioBase) {
        this.id = id;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
    }

    public void mostrarDatos() {
        System.out.println("ID:" + id);
        System.out.println("Descripcion:" + descripcion);
        System.out.println("Precio Base: $" + precioBase);

    }

}
