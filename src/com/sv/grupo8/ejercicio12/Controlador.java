//Paquetes
package com.sv.grupo8.ejercicio12;
// Importaciones
import java.util.Scanner; // Clase Scanner

// Clase Controlador que maneja la lógica de la aplicación Banco
public class Controlador {
    // Declaracion de atributos
    private Scanner scanner;
    private CuentaCorriente cuenta;

    // Constructor de la clase Controlador
    public Controlador() {
        scanner = new Scanner(System.in);
        cuenta = new CuentaCorriente();
    }

    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        controlador.menu();
    }

    // Metodo para mostrar el menu del usuario
    public void menu() {
        /*
        Desde el menu  se dara la bienvenida al usuario y se le mostrara las opciones que tiene para interactuar con la aplicacion:
        como depositar, retirar, consultar saldo y salir del programa.
        */
        // Bandera para salir del menu
        int opcionMenu = 0;

        // Mientras el usurio no salga continuara el bucle
        do {
            System.out.println("""
                    ===== BANCO =====
                    Seleccione una opcion:
                    
                    1. Depositar
                    2. Retirar
                    3. Consultar saldo
                    4. Salir
                    """);
            // Capturamos la seleccion
            opcionMenu = scanner.nextInt();

            // Segun opcion seleccionada ejecutamos flujo
            switch (opcionMenu) {
                case 1 -> {
                    // Caso 1: Depositar dinero en la cuenta
                    System.out.println("Ingrese la cantidad a depositar: ");
                    double cantidadDepositar = scanner.nextDouble();
                    cuenta.depositar(cantidadDepositar);
                    System.out.println("Depósito exitoso.");
                    System.out.println("Saldo actual: " + cuenta.getSaldo());
                    break;
                }
                case 2 -> {
                    // Caso 2: Retirar dinero de la cuenta
                    System.out.println("Ingrese la cantidad a retirar: ");
                    double cantidadRetirar = scanner.nextDouble();
                    if (cuenta.retirar(cantidadRetirar)) {
                        System.out.println("Retiro exitoso.");
                        System.out.println("Saldo actual: " + cuenta.getSaldo());
                    } else {
                        System.out.println("No se puede realizar el retiro. Límite de sobregiro alcanzado.");
                        System.out.println("Saldo actual: " + cuenta.getSaldo());
                    }
                }
                case 3 -> {
                    // Caso 3: Consultar saldo
                    System.out.println("Su saldo actual es: " + cuenta.getSaldo());
                    break;
                }
                case 4 -> {
                    // Caso 4: Salir del programa
                    System.out.println("Gracias por utilizar nuestro servicio. ¡Hasta luego!");
                    System.exit(0);
                    break;
                }
                default -> {
                    // Caso por defecto: Opcion invalida
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
                }
            }
        } while (opcionMenu != 4);
    }
}
