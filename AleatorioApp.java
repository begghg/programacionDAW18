package agosto18;

public class AleatorioApp {
	
	public static int generaNumeroAleatorio(int minimo,int maximo){
        
	       int num=(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
	       return num;
	   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        int num1=50;
	        int num2=120;
	        int [] arrayEnteros= new int[10];
	        int primerPar=0, posPar=0,sumaPares=0;
	        
	 
	        System.out.println("Números generados entre 0 y 20, con decimales (sin incluir el 0 y el 20)");
	        for (int i=0;i<10;i++){
	            double numAleatorio=Math.random()*20;
	            System.out.println(numAleatorio);
	        }
	 
	        System.out.println("Números generados entre 5 y 20, con decimales (sin incluir el 5 y el 20)");
	        for (int i=0;i<10;i++){
	            double numAleatorio=Math.random()*(20-5)+5;
	            System.out.println(numAleatorio);
	        }
	 
	        System.out.println("Números generados entre 50 y 120, sin decimales (sin incluir el 50 y el 120)");
	        for (int i=0;i<10;i++){
	            int numAleatorio=(int)Math.floor(Math.random()*(num1-num2)+num2);
	            System.out.println(numAleatorio);
	        }
	 
	                System.out.println("Números generados entre 50 y 120, sin decimales (incluyendo el 50 y el 120)");
	        for (int i=0;i<10;i++){
	            int numAleatorio=(int)Math.floor(Math.random()*(num1-(num2+1))+(num2));
	            System.out.println(numAleatorio);
	        }
	        
	        System.out.println("Ahora va el mio................");
	        for(int f=0;f<10;f++) {
	        		arrayEnteros[f] = (int)(Math.random()*100+1);
	        		System.out.println(arrayEnteros[f]);
	        		 if (arrayEnteros[f]%2==0)
	        		sumaPares +=arrayEnteros[f];
	        }
	        
	        //Lo vuelvo a recorrer hasta que encuentro el primer par
	        for(int f=0;f<10;f++)
	        if (arrayEnteros[f]%2==0)
			{primerPar=arrayEnteros[f];
			posPar=f;
			
			break;
			
			}
	         if (primerPar!=0) {
	        	 System.out.println("El primer par es: "+primerPar+" y esta en la posicion: "+posPar);
	        	 System.out.println("La suma de todos los pares es: "+sumaPares);
	         }
	         else System.out.println("No hay ni un par....");
	        }
	        
	}

	









