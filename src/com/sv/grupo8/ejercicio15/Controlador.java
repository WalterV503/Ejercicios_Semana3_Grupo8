package com.sv.grupo8.ejercicio15;

public class Controlador {
    public static void main(String[] args) {
        Camion camion = new Camion("P123-456", "Volvo", 3);

        System.out.println("Placa: " + camion.getPlaca());
        System.out.println("Marca: " + camion.getMarca());
        System.out.println("Numero de ejes: " + camion.getNumeroEjes());
    }
}