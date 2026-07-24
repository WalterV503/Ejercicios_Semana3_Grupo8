// Paquetes
package com.sv.grupo8.ejercicio19;

// Entidad Cuenta
public class Cuenta {
    // Inicializamos variables
    private double saldo = 0.00;

    // Metodo para depositar dinero en la cuenta
    public double depositar(double cantidad) {
        // Aumentamos el saldo de la cuenta con la cantidad depositada.
        saldo += cantidad;
        return saldo;
    }

    // Metodo para retirar dinero de la cuenta
    public boolean retirar(double cantidad) throws Exception {
        // Valida que haya fondos suficientes
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        throw new IllegalArgumentException("Fondos insuficientes para realizar el retiro.");
    }

    // Getters y Setters
    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}