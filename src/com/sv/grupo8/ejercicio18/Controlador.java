package com.sv.grupo8.ejercicio18;

import java.util.ArrayList;

public class Controlador {

    public static void main(String[] args) {
        ArrayList<EmpleadoHospital> empleados = new ArrayList<>();

        empleados.add(new Medico("Dr. Martinez"));
        empleados.add(new Enfermera("Ana"));
        empleados.add(new Medico("Dra. Lopez"));
        empleados.add(new Enfermera("Sofia"));

        for (EmpleadoHospital empleado : empleados) {
            empleado.ejecutarTurno();
        }
    }
}
