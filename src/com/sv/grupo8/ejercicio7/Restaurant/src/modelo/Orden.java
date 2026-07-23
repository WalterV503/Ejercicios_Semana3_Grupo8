package modelo;
import java.util.ArrayList;

public class Orden {
	private int ordenNo;
	private int mesaNo;
	private Cliente cliente;
	private ArrayList<DetalleOrden> detalles;
	
	public Orden() {
		detalles = new ArrayList<>();
	}
	public Orden(int ordenNo, int mesaNo, Cliente cliente) {
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
	
	public ArrayList<DetalleOrden> getDetalles(){
		return detalles;
	}
	public void agregarDetalle(DetalleOrden detalle) {
		detalles.add(detalle);
	}
		
	public double calculaTotalaPagar() {
		double total = 0;
		
		for (DetalleOrden detalle: detalles) {
			total += detalle.Subtotal();
		}
		return total;
		}
	public void imprimirorden() {
		System.out.println("\nRestaurante Arci");
		System.out.println("ORDEN DE CONSUMO");
		System.out.println("No." + ordenNo);
		System.out.println("Mesa No." + mesaNo);
		
		cliente.imprimirCliente();
		
		System.out.println("\nDETALLE:");
		System.out.println("Plato Ordenado                            Cantidad       Subtotal");
		
		for (DetalleOrden detalle : detalles) {
			detalle.imprimirOrden();
		}
		System.out.println("------------------------------------------------------------------");
		System.out.println("Total Consumo (Sin propina)                              $" + calculaTotalaPagar());
		
	}
}
