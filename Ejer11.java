package Arrays;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		//Insertar elementos en array
				final int N=10;
				int tab[]=new int [N];
				boolean mas=false;
				int i=0,p,f=0;
				int k=2;
				Scanner sc= new Scanner(System.in);
				do{
					System.out.print("Introduce numero: ");
					tab[i]=sc.nextInt();
					i++;
					System.out.print("Introducir mas numeros (false/true):  ");
					mas=sc.nextBoolean();
				}while(i<N && mas == true);
				
				for(p=0;p<i;p++)
					System.out.print(tab[p]+"\t");
				//Borrar elemento en una posicion determinada.
				if(i<N){
					f=i;
					while(i>=k){
						tab[i]=tab[i+1];
						i++;
					}
					f++;
				}else
					System.out.print("Tabla llena.");
				System.out.println("");
				System.out.println("");
				for(p=0;p<f;p++)
					System.out.print(tab[p]+"\t");
			}
		}
