package com.sv.grupo8.ejercicio14;

public class Controlador {
    public static void main(String[] args) {

        Medico medico = new Medico(
                "Juan Pérez",
                1200,
                "Cardiología"
        );

        medico.mostrarDatos();
    }
}

