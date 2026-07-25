package com.sv.grupo8.ejercicio11;

public class Estudiante extends Persona {
    private final String carnet;

    public Estudiante(String nombre, int id, String carnet) {
        super(nombre, id); 
        this.carnet = carnet;
    }

    public String getCarnet() {
        return carnet;
    }
}