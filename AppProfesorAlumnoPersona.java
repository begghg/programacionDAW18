package octubre18;

public class AppProfesorAlumnoPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nomina=0;
		Persona p1=new Persona("2222D","Juan GOmez",33);
		Profesor prof1=new Profesor("111H","Miguel Angel H", 52, "PT1");
		Alumno al1=new Alumno("234234X", "Tomas Garcia", 20,34555);
		Conserje c1=new Conserje("1283838","Paco", 60,'L');
		
		//Sacamos datos persona
		System.out.println(p1);
		p1.asistirClase();
		
		//DAtos de un profesor
		System.out.println(prof1);
		prof1.asistirClase();
		System.out.println("Nomina="+ prof1.calcularSalario(1500,3));
		
		
		//Datos de un alumno
		al1.setNota1(4.5);
		al1.setNota2(7.0);
		al1.setNota3(8.9);
		
		System.out.print(al1);
		al1.asistirClase();
		if (al1.notas(al1.getNota1(),al1.getNota2(),al1.getNota3()))
		System.out.println("  APROBADO NOTAS: "+al1.getNota1()+ "  "+al1.getNota2()+"  "+al1.getNota3() );
		else 
			System.out.println("SUSPENSO NOTAS: " +al1.getNota1()+ "  "+al1.getNota2()+"  "+al1.getNota3());
		
		//Por ultimo sacamos datos conserje
		System.out.println(c1);
		c1.asistirClase();
		
		

	}

}
