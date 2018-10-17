package Arrays;

public class Ejer4 {

	public static void main(String[] args) {
		// Crear un array de 15 elementos rellenandolo con valores aleatorios.Visualiza sus elementos indicando si es par o impar.
		final int N=15;
		int i;
		int tabla[]= new int [N];
		//Rellenar array
		for (i=0;i<N;i++){
			tabla[i]=(int)(Math.random()*15);
		}
		//Visualizar
		for(i=0;i<N;i++){
			if(tabla[i]%2==0)
				System.out.print(tabla[i]+" es par \n");
			else
				System.out.print(tabla[i]+" es impar \n");
		}
	}
}
