package octubre18;

public class Alumno extends Persona {
	private int numExp;
	private double nota1, nota2,nota3;
	//constructor
	public Alumno() {
		super();
	}
	public Alumno(String dni, String nombre, int edad,int numExp) {
		super(dni, nombre, edad);
		this.numExp=numExp;
	}
	public Alumno(String dni, String nombre, int edad,int numExp,double nota1,double nota2, double nota3) {
		super(dni, nombre, edad);
		// TODO Auto-generated constructor stub
		this.numExp=numExp;
		this.nota1=nota1;
		this.nota2=nota2;
		this.nota3=nota3;
	}
	//getter y setters

	public int getNumExp() {
		return numExp;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double d) {
		this.nota1 = d;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public void setNumExp(int numExp) {
		this.numExp = numExp;
	}
	//metodos heredados y propios
	//Un metodos más
		public void asistirClase() {
			System.out.println("\nEl alumno asiste a clase de 8,30 a 14:15 de L a V");
		}
		
		//Vamos con el mostrar datosssss
		public String toString() {
			return  "Nª de expediente del ALUMNO: "+ numExp+"---> "+ super.toString();
		}
		
		public boolean notas(double nota1, double nota2, double nota3) {
			if ((nota1+nota2+nota3)/3>=5)
					return true;
					else return false;
		}

	
}
