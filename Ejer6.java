package Arrays;

public class Ejer6 {

	public static void main(String[] args) {
		//a.Escribir un programa que tras asignar los numeros 23, 45,68,99,10,15 y 4 a un array, 
		double med=0;
		int k = 0,i,max = 0;
		int tabla[]={23,45,68,99,10,15,4};
		//Determine la posicion en la que se encuentra el elemento mayor.
		for (i=0;i<tabla.length;i++){
			if(tabla[i]>max){
				max=tabla[i];
				k=i;
			}		
		}
		System.out.println("El maximo es: "+max+" que esta en la posicion: "+k);
		//b.Calcular la media de los elementos del array.
		i=0;
		while(i<tabla.length){
			med+=tabla[i];
			i++;
		}
		med= med/tabla.length;
		System.out.println("");
		System.out.println("La media de los elementos de la tabla: "+med);
	}
}
