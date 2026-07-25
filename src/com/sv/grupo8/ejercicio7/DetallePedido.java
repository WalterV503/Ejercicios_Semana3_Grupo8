package com.sv.grupo8.ejercicio7;

public class DetallePedido {
	private Platillo platillo;
	private int cantidad;
	
	public DetallePedido() {
	}

	public DetallePedido(Platillo platillo, int cantidad) {
		this.platillo = platillo;
		this.cantidad = cantidad;
	}
	
	public Platillo getPlatillo() {
		return platillo;
	}
	public void setPlatillo(Platillo platillo) {
		this.platillo = platillo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
	}
	
	public double Subtotal() {
		return  cantidad * platillo.getValor();
	}
	
	public void imprimirOrden() {
		System.out.printf("%-45s %-10d $%-10.2f%n",
		platillo.getNombre(),
		cantidad,
		Subtotal());
	}
}
