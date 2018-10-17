package agosto18;

import java.util.ArrayList;

import calificaciones.Calificaciones;

public class Notas implements Comparable{
	private String nombre;
	private double n1;
	private double n2;
	private double n3;
	double media,mediaG;
	
	
	//Constructores
	public Notas (String nombre, double n1, double n2, double n3)
	{
		this.nombre=nombre;
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
	}
	
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	
	
	public String toString() {
		return "Nombre--->"+getNombre()+" NOTA1:"+getN1()+" NOTA2:"+getN2()+" NOTA3:"+getN3();
	}


	@Override
	public int compareTo(Object objeto2) {
		
		Notas lista1= (Notas) objeto2;
		return nombre.compareToIgnoreCase(lista1.getNombre());
	}
	
	
	

}
