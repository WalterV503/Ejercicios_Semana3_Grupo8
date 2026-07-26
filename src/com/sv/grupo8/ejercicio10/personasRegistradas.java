package com.sv.grupo8.ejercicio10;

public class personasRegistradas {
    private String nombre;
    private int edad;
    private String dui;


    public personasRegistradas (String  nombre, int edad, String dui){
    this.nombre = nombre;
    this.edad = edad;
    this.dui= dui;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    public String getDui() {
        return dui;
    }

}//llave principal
