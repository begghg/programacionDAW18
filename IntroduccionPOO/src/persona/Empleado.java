package persona;

import java.util.Scanner;

public class Empleado {
	// Atributos: nombre, apellidos, edad y salario de tipo privado
	// dos constructores, el de por defecto, que inicializara los atributos. Un
	// segundo constructor con  todos los parametros y un metodo llamado plus que suma una cantidad al
	// salario del empleado si el empleado tiene mas de 40 años.
	private String nombre, apellidos;
	private int edad, salario;

	//constructor vacio o por defecto
	public Empleado() {	}

	public Empleado(String nombre, String apellidos, int edad, int salario) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.salario = salario;
	}

	public  void plus() {
		Scanner sc = new Scanner(System.in);
		if (edad > 40) {
			System.out.println("Introduce el plus para el trabajador: ");
			salario = salario + sc.nextInt();
			System.out.println("Salario con suplemento: " + salario);
		} else
			System.out.println("Eres demasiado joven para un suplemento en tu salario.");
	}
	public  void plus1() {
		Scanner sc = new Scanner(System.in);
		if (edad > 40) {
			System.out.println("Introduce el plus1 para el trabajador: ");
			salario = salario + sc.nextInt();
			System.out.println("Salario con suplemento: " + salario);
		} else
			System.out.println("Eres demasiado joven para un suplemento en tu salario.");
	}
	
	public  void ver() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad);
		System.out.println("Salario: " + salario);
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "\nNombre=" + nombre + ", apellidos=" + apellidos+ " edad: "+edad+ "salario final con plus: "+salario;
	}

}
