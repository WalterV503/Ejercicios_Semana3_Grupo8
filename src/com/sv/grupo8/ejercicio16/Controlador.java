package com.sv.grupo8.ejercicio16;

public class Controlador {
  public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(
            "Carlos Mira",
            2026001,
            "Ingeniería en Desarrollo de Software"
        );

        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("ID: " + estudiante.getId());
        System.out.println("Carrera: " + estudiante.getCarrera());
    }
}
