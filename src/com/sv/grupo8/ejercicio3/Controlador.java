package com.sv.grupo8.ejercicio3;

public class Controlador {
    private String numeroCuenta;
    private double saldo;

    public Controlador(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void aplicarInteresAnual(double porcentaje) {
        double tiempo = 8.0 / 12.0;
        double interes = saldo * porcentaje * tiempo;
        saldo = saldo + interes;
    }
}

class ControladorTest {
    public static void main(String[] args) {
        Controlador cuenta = new Controlador("001", 1000);
        cuenta.aplicarInteresAnual(0.05);
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}