package agosto18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class AppNotas {
	static double media;
	static double mediaG;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Notas> lista=new ArrayList<Notas>();
		//Scanner sc=new Scanner(System.in);
		
		CargaDatos(lista);
		MostrarDatos(lista);
		//Lista ordenada por nombre
		System.out.println("Lista ordenada por nombre: ");
		Collections.sort(lista);
		System.out.println(lista);
		
		//Si lo quiero mostrar de mayor a menor
		Comparator<Notas> comparador = Collections.reverseOrder();
		Collections.sort(lista, comparador);
		System.out.println("Lista ordenada por nombre de mayor a menor: ");
		//Collections.sort(lista);
		System.out.println(lista);
		
		//Sacamos la media de la nota por alumno y por grupo
		System.out.println("media por alumno: ");
		mediaAlu(lista);
		mediaG(lista);
		
	}
	public static void CargaDatos(ArrayList<Notas> lista) {
		//Notas alumno=new Notas();
		Scanner sc=new Scanner(System.in);
		System.out.println("Numero de alumnos:");
		int num=sc.nextInt();
		for (int i=0; i<num;i++) {
			System.out.println("Nombre:");
			String nombre=sc.next();
			System.out.println("Nota1:");
			int n1=sc.nextInt();
			System.out.println("Nota2:");
			int n2=sc.nextInt();
			System.out.println("Nota2:");
			int n3=sc.nextInt();
			Notas alumno=new Notas(nombre, n1, n2, n3);
			lista.add(alumno);
		}
	}
	public static void MostrarDatos(ArrayList<Notas> lista) {	
		for (int i=0;i<lista.size();i++) {
			System.out.println("Alumno"+(i+1)+ " "+lista.get(i));
		}
			
	}
	
	public static void mediaAlu(ArrayList <Notas> lista){
		for(int i=0;i<lista.size();i++){
			media=0;
			media=(double)(lista.get(i).getN1()+lista.get(i).getN2()+lista.get(i).getN3())/3;
			System.out.println("La media del alumno"+ lista.get(i).getNombre()+" es: "+media);
		}
	}
	public static void mediaG(ArrayList<Notas> lista){
		
		for(int i=0;i<lista.size();i++){
			media=0;
			media=(double)(lista.get(i).getN1()+ lista.get(i).getN2()+lista.get(i).getN3())/3;
			mediaG=(double)mediaG+media;
		}
		mediaG=mediaG/lista.size();
		System.out.println("La media del grupo es: "+mediaG);
	}
	


}
