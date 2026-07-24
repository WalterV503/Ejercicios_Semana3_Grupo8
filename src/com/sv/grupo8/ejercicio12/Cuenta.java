//Paquetes
package com.sv.grupo8.ejercicio12;

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
    public boolean retirar(double cantidad) {
        // Verificamos que exista saldo suficiente para realizar el retiro.
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    // Getters y Setters
    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
