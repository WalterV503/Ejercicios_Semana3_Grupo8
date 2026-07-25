package com.sv.grupo8.ejercicio20;

public class Mecanico extends EmpleadoTaller {
    public Mecanico(String nombre) {
        super(nombre);
        this.salario = 420;
    }

    @Override
    public double calcularPago() {
        return salario + (horasExtra * 5);
    }
}