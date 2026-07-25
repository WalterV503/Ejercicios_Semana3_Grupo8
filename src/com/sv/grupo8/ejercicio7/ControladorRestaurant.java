package com.sv.grupo8.ejercicio7;

public class ControladorRestaurant {
	public void inicio() {
		Cliente cliente = new Cliente(100,"Familia Zepeda");
		
		Platillo pl1 = new Platillo(500,"Tacos de Lengua",7.25);
		Platillo pl2 = new Platillo(501,"Torta Mexicana",6.50);
		Platillo pl3 = new Platillo(605,"Wantan (12 unidades)",8.75);
		Platillo pl4 = new Platillo(610,"Sopa de Tortillas",5.00);
		Platillo pl5 = new Platillo(700,"Frozen de Coco", 4.50);
	
		Orden orden = new Orden (75, 5, cliente);
		
		orden.agregarDetalle(new DetalleOrden(pl1,2));
		orden.agregarDetalle(new DetalleOrden(pl2,2));
		orden.agregarDetalle(new DetalleOrden(pl3,1));
		orden.agregarDetalle(new DetalleOrden(pl4,2));
		orden.agregarDetalle(new DetalleOrden(pl5,2)); 
		
		orden.imprimirorden();
		
	}

}
