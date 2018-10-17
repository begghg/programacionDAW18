package Arrays;

public class Numeros {

	public static void main(String[] args) {
		final int n=100;
		
//declaracion
		int spar=0;
		int numeros[];
		
//instanciacion o reserva de memoria.
		
		numeros = new int [100];
		
//definicion e instanciacion del array
		
		int numero1[] = new int [100];
		numeros=new int[100];
		
//cargar array
		
		for(int i=0;i<100;i++){
			numeros[i]= i+1;
		}
		
//visualizar el contenido del array
		
		int i=0;
		while(i<100){
			if(i!=99)
				System.out.print(numeros[i]+" - ");
			else
				System.out.print(numeros[i]);
			i++;
		}
//Sumar los numeros pares
		
		i=0;
		do{
			if(numeros[i] % 2 == 0)
				spar=spar + numeros[i];
			i++;
		}while(i<100);
		System.out.println("\nLa suma de los numeros pares es: "+spar);
//Sumar los numeros que ocupen las posiciones pares.
		spar=0;
		for(i=0;i<n;i++){
			if(i%2==0)
				spar=spar+numeros[i];
		}
		System.out.println("\nSuma posiciones pares: "+spar);
			
				
	}

}
