package com.sv.grupo8.ejercicio13;

public class ArticuloFisico extends Articulo {
    private double pesoKg;

    public ArticuloFisico(int id,String descripcion, double precioBase, double pesoKg) {
        super(id, descripcion, precioBase);
        this.pesoKg = pesoKg;

    }
@Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Peso:"+ pesoKg + "Kg");
}


}


