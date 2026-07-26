package com.sv.grupo8.ejercicio17;

import java.util.ArrayList;

public class Controlador {
    public static void main(String[] args) {
        ArrayList<Articulo> articulos = new ArrayList<>();

        articulos.add(new ArticuloFisico(1, "Libro de programacion", 25.99, 1.2));
        articulos.add(new ArticuloDigital(2, "Curso de Java", 15.50, "https://tienda.com/curso-java"));
        articulos.add(new ArticuloFisico(3, "Teclado mecanico", 49.99, 0.8));
        articulos.add(new ArticuloDigital(4, "Ebook de bases de datos", 9.99, "https://tienda.com/ebook-bd"));

        System.out.println("=== CATALOGO DE ARTICULOS ===");
        for (Articulo articulo : articulos) {
            articulo.mostrarFicha();
            System.out.println("-----------------------------");
        }
    }
}
