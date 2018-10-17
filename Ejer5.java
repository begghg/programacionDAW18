package Arrays;

public class Ejer5 {

	public static void main(String[] args) {
		// Crear un array de 10 elementos con valores comprendidos entre el 1 y el 5 y despues, indicar el numero de veces que se repite el numero de elementos en el array-
		final int N=10;
		int i,a = 0,b = 0,c = 0,d = 0,e = 0;
		int tabla[]=new int [N];
		//Rellenar
		for(i=0;i<N;i++){
			tabla[i]=(int)(Math.random()*5+1);
		}
		//visualizar e indicar el numero de veces que se repiten los elementos.
		for(i=0;i<N;i++){
			System.out.print(tabla[i]+" - ");
			switch(tabla[i]){
			case 1: a++;
			break;
			case 2: b++;
			break;
			case 3: c++;
			break;
			case 4: d++;
			break;
			case 5: e++;
			}
		}
			System.out.println("");
			System.out.println("El numero de 1 es: "+a);
			System.out.println("El numero de 2 es: "+b);
			System.out.println("El numero de 3 es: "+c);
			System.out.println("El numero de 4 es: "+d);
			System.out.println("El numero de 5 es: "+e);
		
	}
}
