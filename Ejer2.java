package Arrays;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// Llene un array de 10 numeros enteros leidos por teclado y a continuacion, calcule y muestre la media de los valores positivos y la media de los valores negativos.
		Scanner sc = new Scanner(System.in);
		final int N=10;
		int i,sp,sn,cp,cn;
		double medp,medn;
		int tabla[] = new int[N];
		//Introducir 10 numeros enteros
		for(i=0;i<N;i++){
			System.out.print("Introduce numero: ");
			tabla[i]= sc.nextInt();
		}
		//Llenar Array
		sp=0;cp=0;sn=0;cn=0;
		for(i=0;i<N;i++){
			if(tabla[i]>=0){
				sp=sp+tabla[i];
				cp=cp+1;
			}else{
				sn+=tabla[i];
				cn++;
			}
		}
		//Calcular media numeros positivos y negativos
		if(cp!=0){
			medp=(double)sp/cp;
			System.out.println("La media de los numeros positivos= "+medp);
		}else
			System.out.println("No se puede calcular la media, por que no hay numeros positivos");
		if(cn!=0){
			medn=(double)sn/cn;
			System.out.println("La media de los numeros negativos= "+medn);
		}else
			System.out.println("No se puede calcular la media, por que no hay numeros negativos");
	}
}
