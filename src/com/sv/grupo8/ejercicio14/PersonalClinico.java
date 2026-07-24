package com.sv.grupo8.ejercicio14;

public class PersonalClinico {

    protected String nombre;
    protected double salarioBase;

    public PersonalClinico(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioNeto() {
        return salarioBase;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Base: $" + salarioBase);
    }
}

