package persona;

public class Persona {
	private String nombre="";
	private int edad=0;
	private String dni="";
	private char sexo='H';
	private double peso=0.0;
	private double altura=0.0;
	
	//Constructores
	public  Persona(){}
	public Persona (String nombre,int edad,char sexo ){ 
		this(nombre, edad, " ", sexo,0.0,0.0);
	}	
	public Persona(String nombre, int edad,String dni, char sexo, double peso, double altura){
		this.nombre=nombre;
		this.edad=edad;
		this.dni=dni;
		this.altura=altura;
		this.peso=peso;
	} 
	
	//gets y puts	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(long peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(long altura) {
		this.altura = altura;
	}
	
	//resto metodos
		public boolean esMayorDeEdad(){
			if (this.edad>18)
				return true;
			else return false;
	}		
	
		public String tipoSexo() {
			if (this.sexo=='H') return "Es VARON";
			else return "Es MUJER";
		}
	

}
