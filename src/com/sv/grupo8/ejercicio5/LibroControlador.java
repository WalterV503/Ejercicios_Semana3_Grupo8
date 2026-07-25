package com.sv.grupo8.ejercicio5;

public class LibroControlador {

    public static void main(String[] args) {

        Libro[] libros = new Libro[3];


        libros[0] = new Libro("Cien Anios de Soledad", "Gabriel Garcia Marquez");
        libros[1] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
        libros[2] = new Libro("El Principito", "Antoine de Saint-Exupery");


        for (int i = 0; i < libros.length; i++) {
            System.out.println("Titulo: " + libros[i].getTitulo() + " - Autor: " + libros[i].getAutor());
        }
    }
}
