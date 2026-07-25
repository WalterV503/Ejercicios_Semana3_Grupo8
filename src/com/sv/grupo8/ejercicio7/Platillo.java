package com.sv.grupo8.ejercicio7;

public class Platillo {
	private int codigo;
	private String nombre;
	private double valor;
	
	public Platillo() {
	}
	
	public Platillo(int codigo, String nombre, double valor ) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.valor = valor;
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
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public double getValor() {
		return valor;
	}
	public void  setValor (double valor) {
		this.valor = valor;
	}
	public void imprimirPlatillo() {
		System.out.print(codigo + nombre + "- $" + valor );
	}
}
