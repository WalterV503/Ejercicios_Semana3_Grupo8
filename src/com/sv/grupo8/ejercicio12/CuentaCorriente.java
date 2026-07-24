//Paquetes
package com.sv.grupo8.ejercicio12;

// Clase que representa una cuenta corriente extiende de clase padre cuenta
public class CuentaCorriente extends Cuenta {

    // Inicializamos variables
    private double limiteSobregiro = -115.00; // bandera para detectar limite de sobregiro

    // Metodo para retirar dinero permitiendo utilizar el límite de sobregiro establecido.
    @Override
    public boolean retirar(double cantidad) {
        // Sobreescribimos el metodo retirar para permitir sobregiro hasta el limite establecido
        double nuevoSaldo = getSaldo() - cantidad;

        // Verificamos que el nuevo saldo no supere el límite de sobregiro permitido.
        // Si cumple la condición, se actualiza el saldo; de lo contrario, se rechaza el retiro.
        if (nuevoSaldo >= limiteSobregiro) {
            setSaldo(nuevoSaldo);
            return true;
        } else {
            System.out.println("No se puede retirar esa cantidad. Límite de sobregiro alcanzado.");
            return false;
        }
    }
}
