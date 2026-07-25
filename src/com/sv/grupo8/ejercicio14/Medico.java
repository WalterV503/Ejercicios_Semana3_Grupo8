package com.sv.grupo8.ejercicio14;

public class Medico extends PersonalClinico{

    private String especialidad;
    private final double BONO = 500;

    public Medico(String nombre, double salarioBase, String especialidad) {
        super(nombre, salarioBase);
        this.especialidad = especialidad;
    }

    @Override
    public double calcularSalarioNeto() {
        return salarioBase + BONO;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Salario Neto: $" + calcularSalarioNeto());
    }
}

