package com.sv.grupo8.ejercicio2;


public class Paciente {

    private String nombrePaciente;
    private int edadPaciente;
    private int edadIngresada;
    private double pesoPaciente;



    public Paciente(String nombrePaciente, int edadPaciente, double pesoPaciente) {
        this.nombrePaciente = nombrePaciente;
        this.setEdadPaciente(edadPaciente);
        this.pesoPaciente = pesoPaciente;
    }


    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public int getEdadPaciente() {
        return edadPaciente;
    }

    public void setEdadPaciente(int edadPaciente) {

        this.edadIngresada = edadPaciente;

        if (edadPaciente < 0 || edadPaciente > 120) {
            this.edadPaciente = 0;
        } else {
            this.edadPaciente = edadPaciente;
        }

    }

    public double getPesoPaciente() {
        return pesoPaciente;
    }

    public void setPesoPaciente(double pesoPaciente) {
        this.pesoPaciente = pesoPaciente;
    }


    public void mostrarFicha() {

        System.out.println("Nombre:" + this.nombrePaciente);

        if (this.edadIngresada != this.edadPaciente) {
            System.out.println("Edad:" + this.edadIngresada + ", edad asignada:" + this.edadPaciente);
        } else {
            System.out.println("Edad:" + this.edadPaciente);
        }

        System.out.println("Peso:" + this.pesoPaciente);
        System.out.println("--------------------------------------");

    }
}