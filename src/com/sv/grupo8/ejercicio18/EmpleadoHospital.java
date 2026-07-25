package com.sv.grupo8.ejercicio18;

public class EmpleadoHospital {

    protected String nombre;

    public EmpleadoHospital(String nombre) {
        this.nombre = nombre;
    }

    public void ejecutarTurno() {
        System.out.println("Turno del empleado hospitalario");
    }
}
