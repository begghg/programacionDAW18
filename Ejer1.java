package Arrays;

public class Ejer1 {

	public static void main(String[] args) {
		// Hacer un programa que copie el contenido de un array generado aleatoreamente de 20 elementos en otro y visualice los dos para que la copia se ha realizado correctamente
		final int N=20;
		int tabla1[] = new int[N];
		int tablaC[] = new int[N];
		int i;
		//carga tabla 1
		for(i=0;i<N;i++){
			tabla1[i]=(int)(Math.random()*20);
		}
		//Copiar array en el segundo.
		for(i=0;i<N;i++){
			tablaC[i]=tabla1[i];
		}
		//Visualizar tabla 1 y tabla C.
		System.out.println("tabla1"+"\t"+"tablaC");
		for(i=0;i<N;i++){
			System.out.println(tabla1[i]+"\t"+tablaC[i]);
		}
	}
}
