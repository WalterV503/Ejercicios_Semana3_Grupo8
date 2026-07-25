package com.sv.grupo8.ejercicio20;

public class JefeTaller extends EmpleadoTaller {
    public JefeTaller(String nombre) {
        super(nombre);
        this.salario = 600;
    }

    @Override
    public double calcularPago() {
        return salario + (horasExtra * 8);
    }
}