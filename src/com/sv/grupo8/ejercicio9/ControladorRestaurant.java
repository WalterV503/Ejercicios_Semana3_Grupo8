package com.sv.grupo8.ejercicio9;
import java.util.Scanner;

public class ControladorRestaurant {
	public void inicio() {
		Cliente cliente = new Cliente(100,"Familia Zepeda");
		
		Platillo pl1 = new Platillo(500,"Tacos de Lengua",7.25);
		Platillo pl2 = new Platillo(501,"Torta Mexicana",6.50);
		Platillo pl3 = new Platillo(605,"Wantan (12 unidades)",8.75);
		Platillo pl4 = new Platillo(610,"Sopa de Tortillas",5.00);
		Platillo pl5 = new Platillo(700,"Frozen de Coco", 4.50);
	
		Pedido orden = new Pedido (75, 5, cliente);
		
		orden.agregarDetalle(new DetallePedido(pl1,2));
		orden.agregarDetalle(new DetallePedido(pl2,2));
		orden.agregarDetalle(new DetallePedido(pl3,1));
		orden.agregarDetalle(new DetallePedido(pl4,2));
		orden.agregarDetalle(new DetallePedido(pl5,2)); 
		
		orden.imprimirOrden();

		Scanner teclado = new Scanner(System.in);

		System.out.print("\nIngrese el tipo de pago (E = Efectivo, T = Tarjeta): ");
		char tipoPago = teclado.next().charAt(0);
		
		double totalFinal = orden.tipoDePago(tipoPago);
		System.out.printf("Total a pagar: $%.2f%n", totalFinal);

		teclado.close();
	}

}
