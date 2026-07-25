package com.sv.grupo8.ejercicio7;

public class Cliente {
	private int codigo;
	private String nombre;
	
	public Cliente() {
		
	}
	public Cliente(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void imprimirCliente() {
		System.out.println("Código del Cliente: "+ codigo);
		System.out.println("Nombre del Cliente: "+ nombre);
	}
}
