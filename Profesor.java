package octubre18;

public class Profesor  extends Persona{
	private String idProfesor;
	private double salario;
	private int trienios;

	//Constructor
	public Profesor() {
		super();
	}
	public Profesor(String dni, String nombre, int edad, String idProfesor) {
		super(dni, nombre, edad);
		// TODO Auto-generated constructor stub
		this.idProfesor=idProfesor;
	}

	//Get y set para idProfesor
	public String getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}
	
	//Vamos a retocar los metodos heredados
	
	//Un metodos más
	public void asistirClase() {
		System.out.println("El profesor imparte clase");
	}
	
	//Vamos con el mostrar datosssss
	public String toString() {
		return  "PROFESOR con IdProfesor: "+ idProfesor+"-->"+ super.toString() ;
	}

	public double calcularSalario (double salario, int trienios) {
		switch (trienios) {
		case 0: break;
		case 1: salario +=30; break;
		case 2: salario +=60; break;
		case 3: salario +=100; break;
		case 4:salario+=120; break;
		default: salario+=200;
		}
		return salario;
		
	}
		
}
	


