package com.sv.grupo8.ejercicio18;

public class Medico extends EmpleadoHospital {

    public Medico(String nombre) {
        super(nombre);
    }

    @Override
    public void ejecutarTurno() {
        System.out.println("Turno Matutino");
    }
}
