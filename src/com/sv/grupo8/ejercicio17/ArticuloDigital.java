package com.sv.grupo8.ejercicio17;

public class ArticuloDigital extends Articulo {

    private String urlDescarga;

    public ArticuloDigital(int id, String descripcion, double precioBase, String urlDescarga) {
        super(id, descripcion, precioBase);
        this.urlDescarga = urlDescarga;
    }
}
