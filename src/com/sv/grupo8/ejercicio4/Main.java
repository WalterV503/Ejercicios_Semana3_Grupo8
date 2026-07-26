package com.sv.grupo8.ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Producto producto = null;
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n========== MENÚ DE PRODUCTO ==========");
            System.out.println("1. Ver precio");
            System.out.println("2. Modificar precio");
            System.out.println("3. Modificar nombre de producto");
            System.out.println("4. Agregar producto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (producto == null) {
                        System.out.println("No hay ningún producto registrado. Elija la opción 4 primero.");
                    } else {
                        System.out.println(" El precio de '" + producto.getNombre() + "' es: $" + producto.getPrecio());
                    }
                    break;

                case 2:
                    if (producto == null) {
                        System.out.println("No hay ningún producto para modificar. Registre uno primero.");
                    } else {
                        System.out.print("Ingrese el nuevo precio: $");
                        double nuevoPrecio = scanner.nextDouble();
                        scanner.nextLine();
                        producto.setPrecio(nuevoPrecio);
                        System.out.println("Precio actualizado correctamente.");
                    }
                    break;

                case 3:
                    if (producto == null) {
                        System.out.println("No hay ningún producto para modificar. Registre uno primero.");
                    } else {
                        System.out.print("Ingrese el nuevo nombre del producto: ");
                        String nuevoNombre = scanner.nextLine();
                        producto.setNombre(nuevoNombre);
                        System.out.println("Nombre actualizado correctamente.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el nombre del nuevo producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: $");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();

                    producto = new Producto(nombre, precio);
                    System.out.println("Producto agregado con éxito: " + producto.getNombre());
                    break;

                case 5:
                    System.out.println("Saliendo del programa... ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}



