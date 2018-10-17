package Arrays;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double med=0;
		int num,i,val,suma=0,a=0;
		//Determinar la cantidad de elementos del array.
		System.out.print("introduce cantidad de elementos del array: ");
		num=sc.nextInt();
		int tabla[]=new int [num];
		//Rellenar array.
		for(i = 0;i<num;i++){
			System.out.print("introduce valor del array: ");
			val=sc.nextInt();
			tabla[i]=val;
		}
		//Calcular la suma y la media.
		for(i=0;i<num;i++){
			if (i%2==0){
					suma+=tabla[i];
					a++;
			}
		}
		med=suma/a;
		System.out.println("La suma de los pares es: "+suma);
		System.out.println("La media de los pares es: "+med);
		
	}

}
