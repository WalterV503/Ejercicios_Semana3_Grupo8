package com.sv.grupo8.ejercicio6;

import java.util.ArrayList;

public class Controlador {


    private static ArrayList<Libro> libros = new ArrayList<>();

    public static void main(String[] args) {

        libros.add(new Libro("Cien Anios de Soledad", "Gabriel Garcia Marquez"));
        libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes"));
        libros.add(new Libro("El Principito", "Antoine de Saint-Exupery"));


        for (Libro libro : libros) {
            System.out.println("Titulo: " + libro.getTitulo() + " - Autor: " + libro.getAutor());
        }


        String tituloBuscado = "El Principito";
        Libro encontrado = buscarLibroPorTitulo(tituloBuscado);

        if (encontrado != null) {
            System.out.println("\nLibro encontrado -> Titulo: " + encontrado.getTitulo()
                    + " | Autor: " + encontrado.getAutor());
        } else {
            System.out.println("\nNo se encontro ningun libro con el titulo: " + tituloBuscado);
        }
    }


    public static Libro buscarLibroPorTitulo(String titulo) {

        for (int i = 0; i < libros.size(); i++) {
            Libro libroActual = libros.get(i);

            if (libroActual.getTitulo().equalsIgnoreCase(titulo)) {
                return libroActual;
            }
        }


        return null;
    }
}
