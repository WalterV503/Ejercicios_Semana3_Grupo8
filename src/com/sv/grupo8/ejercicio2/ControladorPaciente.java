package com.sv.grupo8.ejercicio2;

public class ControladorPaciente {

        public static void main(String[] args) {

            Paciente paciente = new Paciente("Gabriel Juarez",28,140.0);
            Paciente paciente1 = new Paciente("Carlos Castillo",-12,150.0);
            Paciente paciente2 = new Paciente("Mario Alvarez",278,160.0);

            paciente.mostrarFicha();
            paciente1.mostrarFicha();
            paciente2.mostrarFicha();

    }
}
