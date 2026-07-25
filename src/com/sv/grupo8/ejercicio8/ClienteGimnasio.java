package com.sv.grupo8.ejercicio8;

public class ClienteGimnasio {
    private String nombre;
    private int contadorDeAsistencias;

    public ClienteGimnasio(String nombre) {
        this.nombre = nombre;
        this.contadorDeAsistencias = 0;
    }

    public void registroDeEntrada() {
        contadorDeAsistencias++;
        System.out.println("Bienvenido " + nombre + ", su numero de asistencia es " + contadorDeAsistencias);
    }

    public int getContadorAsistencias() {
        return contadorDeAsistencias;
    }

}