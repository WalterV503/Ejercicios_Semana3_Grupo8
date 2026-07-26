package com.sv.grupo8.ejercicio11;

public class Estudiante extends Persona {

    private String carnet;

    public Estudiante(String nombre, int id, String carnet) {
        this.nombre = nombre;
        this.id = id;
        this.carnet = carnet;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Carnet: " + carnet);
    }
}