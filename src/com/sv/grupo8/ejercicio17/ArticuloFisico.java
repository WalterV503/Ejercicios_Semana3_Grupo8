package com.sv.grupo8.ejercicio17;

public class ArticuloFisico extends Articulo {

    private double pesoKg;

    public ArticuloFisico(int id, String descripcion, double precioBase, double pesoKg) {
        super(id, descripcion, precioBase);
        this.pesoKg = pesoKg;
    }

    @Override
    public void mostrarFicha() {
        super.mostrarFicha();
        System.out.println("Peso: " + pesoKg + " kg");
    }
}
