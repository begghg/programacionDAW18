package coche;

public class AppCoche2 {

	public static void ordenaTablaCoches(Coche1[] t) {
		Coche1 aux;
		for(int i=0;i<t.length;i++)
			for (int j=0;j<t.length-1;j++) {
				if (t[j].getModelo().compareTo(t[j+1].getModelo())>1) {
					aux=t[j];
					t[j]=t[j+1];
					t[j+1]=aux;
				}
		}
	}
	public static void ordenaTablaPrecio(Coche1[] t) {
		Coche1 aux;
		for(int i=0;i<t.length;i++)
			for (int j=0;j<t.length-1;j++) {
				if (t[j].getPrecio().compareTo(t[j+1].getModelo())>1) {
					aux=t[j];
					t[j]=t[j+1];
					t[j+1]=aux;
				}
		}
	}
	
	public static void mostrarArrayCoches(Coche1 [] t) {
		for (Coche1 n:t) {
			System.out.print("\t"+n.getModelo()+n.getMarca()+n.getColor());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche1 c1=new Coche1("Clio","Renault","Blanco",110);
		Coche1 c2=new Coche1();
		Coche1 c3=new Coche1("A3","Audi","Rojo",200);
		Coche1 c4=new Coche1("Q6","Audi","Rojo",400);
			
		//Para el coche2 le damos valores por medio de los metodos setters
		c2.setModelo("Modelo 205");
		c2.setMarca("Peugeot");
		c2.setColor("gris oscuro");
		c2.setCilindrada(90);
		
		Coche1 tablaCoches[]=new Coche1[4];
		tablaCoches[0]=c1;
		tablaCoches[1]=c2;
		tablaCoches[2]=c3;
		tablaCoches[3]=c4;
		
		System.out.println("Array coches antes de ordenar........\n"); 
		
		mostrarArrayCoches(tablaCoches);
		
		ordenaTablaCoches(tablaCoches);
		System.out.println("\nArray coches Ordenadito por modelo........\n"); 
		mostrarArrayCoches(tablaCoches);
		System.out.println("\n");		
		//Llamamos al metodo imprimir para sacar los datos de ambos objetos de tipo coche	
		c1.imprimir();
		c2.imprimir();
		
		//Si solo quiero imprimir el modelo y la cilindrada de c1 y c2
		System.out.println("El modelo de c1 es----"+ c1.getModelo()+ " la cilindrada es--->"+ c1.getCilindrada());
		System.out.println("El modelo de c2 es----"+ c2.getModelo()+ " la cilindrada es--->"+ c2.getCilindrada());

	}

}
