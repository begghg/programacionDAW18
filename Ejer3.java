package Arrays;

public class Ejer3 {

	public static void main(String[] args) {
		// Cear un array rellenandolo con valores aleatorios de 20 elementos.Copiar el contenido de este array en otro pero al reves y visualizar los arrays.
		final int N=20;
		int i,k;
		int tabla[] = new int[N];
		int tabla2[] = new int[N];
		//Rellenar array.
		for(i=0;i<N;i++){
			tabla[i]=(int)(Math.random()*20);
		}
		//Copiar array al reves.
		k=0;
		for(i=N-1;i>=0;i--){
			tabla2[i]=tabla[k];
			k++;
		}
		//Visualizar arrays
		for(i=0;i<N;i++){
		System.out.println(tabla[i]+" \t "+tabla2[i]);
		}
	}
}
