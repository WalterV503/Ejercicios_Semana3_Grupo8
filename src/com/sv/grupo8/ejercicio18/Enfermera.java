package com.sv.grupo8.ejercicio18;

public class Enfermera extends EmpleadoHospital {

    public Enfermera(String nombre) {
        super(nombre);
    }

    @Override
    public void ejecutarTurno() {
        System.out.println("Turno Nocturno");
    }
}
