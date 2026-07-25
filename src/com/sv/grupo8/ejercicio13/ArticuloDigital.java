package com.sv.grupo8.ejercicio13;

public class ArticuloDigital extends Articulo{

    private String urlDescarga;

    public ArticuloDigital(int id, String descripcion, double precioBase, String urlDescarga) {
        super(id, descripcion, precioBase);
        this.urlDescarga = urlDescarga;

    }
@Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("URL de descarga:" + urlDescarga);
    }
}
