package octubre18;

public class Conserje extends Persona{
	public char trabajo;
	
	//constructores
	public Conserje() {
		super();
	}
	public  Conserje(String dni, String nombre, int edad,char trabajo) {
		super(dni, nombre, edad);
		this.trabajo=trabajo;
	}
	//getter y setter
	public char getTrabajo() {
		return trabajo;
	}
	public void setTrabajo(char trabajo) {
		this.trabajo = trabajo;
	}
	//metodos propios
	public void asistirClase() {
		System.out.println("El conserje trabaja en el IES");
	}
	
	public String deQueTrabaja(char trabajo) {
		if (trabajo=='F') return "Hace fotocopias";
		else if (trabajo=='L') return "Limpieza aulas";
		else return "Vigila entrada y salida de alumnos";
	}
	//Vamos con el mostrar datosssss
	public String toString() {
		return  "Funcion del conserje: "+ deQueTrabaja(trabajo) +"--->"+ super.toString();
	}
	

}
