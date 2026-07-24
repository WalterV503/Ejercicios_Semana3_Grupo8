package com.sv.grupo8.ejercicio13;

public class Controlador {

    public static void main(String[] ar) {

        ArticuloFisico fisico = new ArticuloFisico(1, "Laptop", 850.00, 2.3);
        ArticuloDigital digital = new ArticuloDigital(2, "curso Java", 55.99, "https://descargas.com/java");


        System.out.println("Articulo Fisico:");
        fisico.mostrarDatos();

        System.out.println();

        System.out.println("Articulo Digital:");
        digital.mostrarDatos();
            }
    }
