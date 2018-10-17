package eval1.ArraysArrays;

public class Edades {
	/*se desea leer las edades de un grupo de 100 personas para:
	visualizar la posicion y edad de cada una de las personas.
	calcular y visualizar cuantas personas estan por encima de la edad media.
	Calcular y visualizar la edad mayor.
	Calcular y visualizar la edad menor.
	Calcular y visualizar cuantas personas son mayores de edad.
	Calcular y visualizar las personas menores de 60 años y mayores de 18*/
	
	public static void main(String[] args) {
			int NUM=100;
			int edades[] = new int [NUM];
			int n = 0;
			double med=0;
			int i,con,min,max;
			//Cargar array con las edades comprendidas 1 y 100
			for (i=0; i<NUM;i++){
				n=(int)(Math.random()*100+1);
				edades[i]=n;
			}
			//visualizar la posicion y edad de cada una de las personas.
			System.out.println("Posicion y edad de las personas");
			for(i = 0;i<NUM;i++){
				System.out.println(i+"\t"+edades[i]);
			}
			//calcular y visualizar cuantas personas estan por encima de la edad media.
			//calcular la media.
			i=0;
			while (i<NUM){
				med=med+edades[i];
				i++;
			}
			med=med/NUM;
			System.out.println("\n"+"La edad media es "+med);
			con=0;
			//Contar las personas por encima de la media.
			for(i=0;i<NUM;i++){
				if(edades[i]>med)
					con= con+1;
			}
			System.out.println("\n"+"EL numero de personas por encima de la media son: "+con);
			
			//calcular y visualizar la edad mayor
			max=edades[0];
			for(i=1;i<NUM;i++){
				if(edades[i]>max)
					max=edades[i];
			}
			System.out.println("La edad mayor es: "+max);
			//calcular y visualizar la edad menor
			min=edades[0];
			for(i=1;i<NUM;i++){
				if(edades[i]<min)
					min=edades[i];
			}
			System.out.println("La edad menor es: "+min);
			//Calcular y visualizar cuantas personas son mayores de edad.
			i=0;
			con=0;
			do{
				if(edades[i]>=18)
					con++;
				i++;
			}while(i<NUM);
			System.out.println("El numero de personas mayores de edad son: "+con);
			//Calcular y visualizar las personas menores de 60 años y mayores de 18*/
			con=0;
				for(i=0;i<NUM;i++){
					if(edades[i]>18 && edades[i]<60)
						con++;
				}
				System.out.println("El numero de personas comprendidas entre 18 y 60 años son: "+con);
	}

}
