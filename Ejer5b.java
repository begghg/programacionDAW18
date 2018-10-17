package Arrays;

public class Ejer5b {

	public static void main(String[] args) {
		// Crear un array de 10 elementos con valores comprendidos entre el 1 y el 5 y despues, indicar el numero de veces que se repite el numero de elementos en el array-
				final int N=10;
				int i,k;
				int tcont[]={0,0,0,0,0};
				int tabla[]=new int [N];
				//Rellenar
				for(i=0;i<N;i++){
					tabla[i]=(int)(Math.random()*5+1);
				}
				//visualizar e indicar el numero de veces que se repiten los elementos.
				for(i=0;i<N;i++){
					k=tabla[i];
					tcont[k-1]=tcont[k-1]+1;
				}
				for(i=0;i<5;i++){
				System.out.println("Hay "+tcont[i]+" elementos con el valor"+" "+(i+1));
				}
			}			
		}
