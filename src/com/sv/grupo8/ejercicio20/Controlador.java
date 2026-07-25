package com.sv.grupo8.ejercicio20;

import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
    public static void main(String[] args) {
        ArrayList<EmpleadoTaller> empleados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU TALLER MECANICO ---");
            System.out.println("1. Agregar jefe de taller (max 4)");
            System.out.println("2. Agregar mecanico (max 20)");
            System.out.println("3. Calcular nomina total");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    long jefes = empleados.stream().filter(e -> e instanceof JefeTaller).count();
                    if (jefes < 4) {
                        System.out.print("Nombre del jefe: ");
                        String nombreJefe = sc.nextLine();
                        empleados.add(new JefeTaller(nombreJefe));
                        System.out.println("Jefe agregado.");
                    } else {
                        System.out.println("Ya hay 4 jefes, no se puede agregar mas.");
                    }
                    break;

                case 2:
                    long mecanicos = empleados.stream().filter(e -> e instanceof Mecanico).count();
                    if (mecanicos < 20) {
                        System.out.print("Nombre del mecanico: ");
                        String nombreMec = sc.nextLine();
                        empleados.add(new Mecanico(nombreMec));
                        System.out.println("Mecanico agregado.");
                    } else {
                        System.out.println("Ya hay 20 mecanicos, no se puede agregar mas.");
                    }
                    break;

                case 3:
                    double totalNomina = 0;
                    for (EmpleadoTaller e : empleados) {
                        totalNomina += e.calcularPago();
                    }
                    System.out.println("La nomina total del taller es: $" + totalNomina);
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}