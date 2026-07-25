package com.sv.grupo8.ejercicio20;

public class EmpleadoTaller {
    protected String nombre;
    protected double salario;
    protected int horasExtra;

    public EmpleadoTaller(String nombre) {
        this.nombre = nombre;
        this.horasExtra = 0;
    }


    public double calcularPago() {
        return salario;
    }

    public void setHorasExtra(int horas) {
        this.horasExtra = horas;
    }

    public String getNombre() {
        return nombre;
    }
}