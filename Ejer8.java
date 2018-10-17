package Arrays;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,val,i,resultado = 0,numero=0;
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
		//calcular
		for(i=0;i<num;i++){
			numero=tabla[i];
			resultado=0;
			while(numero>0){
			resultado= resultado+numero%10;
			numero=numero/10;
			}
			if(resultado%9==0)
				System.out.println(tabla[i]+" Es multiplo de 9 ");
			}
	}

}
