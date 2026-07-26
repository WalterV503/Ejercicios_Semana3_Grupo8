package com.sv.grupo8.ejercicio10;

public class Controlador {
public static void main(String[] args){

AsociacionComunal asociacion= new AsociacionComunal();


//personas registradas

    personasRegistradas p1 = new personasRegistradas("Bryan Reyes", 20, "06879709-1");
    personasRegistradas p2 = new personasRegistradas("Paulo Londra", 26, "09786545-3");
    personasRegistradas p3 = new personasRegistradas("Benito Ocasio", 34, "09876754-1");
//para el conteo
    asociacion.agregarPersonas(p1);
    asociacion.agregarPersonas(p2);
    asociacion.agregarPersonas(p3);



    System.out.println("Total de Personas: " + asociacion.contarPersonas());

    }//llave main
}//llave principal
