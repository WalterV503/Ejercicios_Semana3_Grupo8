package com.sv.grupo8.ejercicio10;

import java.util.ArrayList;
public class  AsociacionComunal {

    ArrayList<personasRegistradas> asociacion = new ArrayList<>();

    public void agregarPersonas(personasRegistradas persona) {
        asociacion.add(persona);
    }

    public int contarPersonas(){
        return asociacion.size();
    }



}//llave principal
