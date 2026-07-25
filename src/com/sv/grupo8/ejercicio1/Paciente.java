package com.sv.grupo8.ejercicio1;

public class Paciente {

    private String nombrePaciente;
    private int edadPaciente;
    private double pesoPaciente;



    public Paciente(String nombrePaciente, int edadPaciente, double pesoPaciente) {
        this.nombrePaciente = nombrePaciente;
        this.edadPaciente = edadPaciente;
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
        this.edadPaciente = edadPaciente;
    }

    public double getPesoPaciente() {
        return pesoPaciente;
    }

    public void setPesoPaciente(double pesoPaciente) {
        this.pesoPaciente = pesoPaciente;
    }


    public void mostrarFicha() {
        System.out.println("Nombre:" + this.nombrePaciente);
        System.out.println("Edad:" + this.edadPaciente);
        System.out.println("Peso:" + this.pesoPaciente);
        System.out.println("--------------------------------------");

    }
}