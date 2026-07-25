package com.sv.grupo8.ejercicio6;

public class Libro {

    private String tituloLibro;
    private String autorLibro;

    public Libro(String titulo, String autor) {
        this.tituloLibro = titulo;
        this.autorLibro = autor;
    }

    public String getTitulo() {
        return tituloLibro;
    }

    public void setTitulo(String titulo) {
        this.tituloLibro = titulo;
    }

    public String getAutor() {
        return autorLibro;
    }

    public void setAutor(String autor) {
        this.autorLibro = autor;
    }
}