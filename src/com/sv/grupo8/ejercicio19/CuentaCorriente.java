// Paquete
package com.sv.grupo8.ejercicio19;

// Clase que representa una cuenta corriente extiende de clase padre cuenta
public class CuentaCorriente extends Cuenta {

    // Inicializamos variables
    private double limiteSobregiro = -115.00; // bandera para detectar limite de sobregiro

    // Metodo para retirar dinero permitiendo utilizar el límite de sobregiro establecido.
    @Override
    public boolean retirar(double cantidad) throws Exception {
        // Calcula el saldo después del retiro
        double nuevoSaldo = getSaldo() - cantidad;

        // Valida que no se exceda el límite de sobregiro permitido
        if (nuevoSaldo >= limiteSobregiro) {
            setSaldo(nuevoSaldo);
            return true; // Retiro exitoso
        }

        throw new Exception("No se puede realizar el retiro. Límite de sobregiro alcanzado.");
    }
}