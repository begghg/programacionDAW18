package coche;

public class Coche1 {
	//propiedades
	private String color; 
	private String marca;
	private String 	modelo;
	private int	cilindrada;
	private float precio;
	
	//constructores
	Coche1(){};
	Coche1(String modelo,String marca,String color, int cilindrada){
		this.modelo=modelo;
		this.marca=marca;
		this.color=color;
		this.cilindrada=cilindrada;
	}
	
	//getters y setters
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	// 	métodos	
	public void imprimir(){
		System.out.println(	"El coche: "+ modelo+" tiene marca: "+marca+" y color: "+color+" y la cilindrada es: "+cilindrada);  
	}
}
