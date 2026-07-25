package com.sv.grupo8.ejercicio16;

public class Estudiante extends Persona {
    private final String carrera;

    public Estudiante(String nombre, int id, String carrera) {
        super(nombre, id); 
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }
}
