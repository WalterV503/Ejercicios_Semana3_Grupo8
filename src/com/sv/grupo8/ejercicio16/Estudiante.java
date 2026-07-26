package com.sv.grupo8.ejercicio16;

public class Estudiante extends Persona {

    private String carnet;

    public Estudiante(String nombre, int id, String carnet) {

        super(nombre, id); // Llama al constructor de Persona

        this.carnet = carnet;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Carnet: " + carnet);
    }
}

