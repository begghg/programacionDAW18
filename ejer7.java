package Arrays;

public class ejer7 {

	public static void main(String[] args) {
		// Cargar dos arrays de 10 elementos cada uno. Visualizar el contenido de los arrays. Hacer la suma de dichos arrays, dejando el resultado en un tercer array.Visualice la suma
		final int N=10;
		int i;
		int tabla[]=new int [N];
		int tabla2[]=new int [N];
		int tabla3[]=new int [N];
		//Cargar
		for(i=0;i<N;i++){
			tabla[i]=(int)(Math.random()*10);
		}
		for(i=0;i<N;i++){
			tabla2[i]=(int)(Math.random()*10);
		}
		//Visualizar
		for(i=0;i<N;i++){
			System.out.println(tabla[i]+" \t "+tabla2[i]);
		}
		//Hacer suma
		for(i=0;i<N;i++){
		tabla3[i]=tabla2[i]+tabla[i];
		}
		//Visualizar
			System.out.println("");
		for(i=0;i<N;i++){
			System.out.println("la suma es: "+tabla3[i]);
		}
	}
}
