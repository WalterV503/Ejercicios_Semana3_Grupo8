package com.sv.grupo8.ejercicio9;
import java.util.ArrayList;

public class Pedido {
	private int ordenNo;
	private int mesaNo;
	private Cliente cliente;
	private ArrayList<DetallePedido> detalles;
	
	public Pedido() {
		detalles = new ArrayList<>();
	}
	public Pedido(int ordenNo, int mesaNo, Cliente cliente) {
		this.ordenNo = ordenNo;
		this.mesaNo = mesaNo;
		this.cliente = cliente;
		detalles = new ArrayList<>();
	}
	
	public int getordenNo() {
		return ordenNo;
	}
	public void setordenNo(int ordenNo) {
		this.ordenNo = ordenNo;
	}
	
	public int getmesaNo() {
		return mesaNo;
	}
	public void setmesaNo(int mesaNo) {
		this.mesaNo= mesaNo;
	}
	
	public Cliente getcliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public ArrayList<DetallePedido> getDetalles(){
		return detalles;
	}
	public void agregarDetalle(DetallePedido detalle) {
		detalles.add(detalle);
	}
		
	public double calculaTotalaPagar() {
		double total = 0;
		
		for (DetallePedido detalle: detalles) {
			total += detalle.Subtotal();
		}
		return total;
		}
	public void imprimirOrden() {
		System.out.println("\nRestaurante Arci");
		System.out.println("ORDEN DE CONSUMO");
		System.out.println("No." + ordenNo);
		System.out.println("Mesa No." + mesaNo);
		
		cliente.imprimirCliente();
		
		System.out.println("\nDETALLE:");
		System.out.println("Plato Ordenado                            Cantidad       Subtotal");
		
		for (DetallePedido detalle : detalles) {
			detalle.imprimirOrden();
		}
		System.out.println("------------------------------------------------------------------");
		System.out.println("Total Consumo (Sin propina)                              $" + calculaTotalaPagar());
		
	}

	public double tipoDePago(char tipoPago) {

    	double total = calculaTotalaPagar();

    	switch (Character.toUpperCase(tipoPago)) {

        	case 'E':
            System.out.println("\nForma de pago: Efectivo");
			System.out.printf("Descuento aplicado: $%.2f%n", total * 0.10);
            total *= 0.90; 
            break;

        	case 'T':
            System.out.println("\nForma de pago: Tarjeta");
			System.out.printf("Recargo aplicado: $%.2f%n", total * 0.03);
            total *= 1.03; 
            break;

        	default:
            System.out.println("\nTipo de pago no válido.");
            return total;
    	}

    return total;
}

}
