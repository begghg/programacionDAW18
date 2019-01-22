package persona;

import java.util.Scanner;

public class AppEmpleado {
	
	public static void cargarD(Empleado e) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre: ");
		e.setNombre(sc.nextLine());
		System.out.println("Apellidos: ");
		e.setApellidos(sc.nextLine());
		System.out.println("Edad: ");
		e.setEdad(sc.nextInt());
		System.out.println("Salario: ");
		e.setSalario(sc.nextInt());
	}
	
	public static void main(String[] args) {
		
		Empleado e = new Empleado();
		cargarD(e);
		System.out.println("");
		e.ver();
		e.plus();
		
		//Empleado emple1  carga datos a través del constructor.
		System.out.println("\n\n Vamos con el segundo empleado, creado con el constructor.....");
				
		Empleado emple1=new Empleado("antonioo","Del Parado",43,2000);
		emple1.ver();
		emple1.plus();
		System.out.println(emple1);

	}

}
