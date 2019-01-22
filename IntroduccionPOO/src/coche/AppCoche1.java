package coche;

public class AppCoche1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche1 c1=new Coche1("Clio","Renault","Blanco",110);
		Coche1 c2=new Coche1();
		
		//Introducimos datos Pero NO directamente porque daria error.
		//c1.modelo="Leon";
		//c1.marca="Seat";
		//c1.color="Negro";
		//c1.cilindrada=220;
		
		
		//Para el coche2 le damos valores por medio de los metodos setters
		c2.setModelo("Modelo 205");
		c2.setMarca("Peugeot");
		c2.setColor("gris oscuro");
		c2.setCilindrada(90);
				
		//Llamamos al metodo imprimir para sacar los datos de ambos objetos de tipo coche	
		c1.imprimir();
		c2.imprimir();
		
		//Si solo quiero imprimir el modelo y la cilindrada de c1 y c2
		System.out.println("El modelo de c1 es----"+ c1.getModelo()+ " la cilindrada es--->"+ c1.getCilindrada());
		System.out.println("El modelo de c2 es----"+ c2.getModelo()+ " la cilindrada es--->"+ c2.getCilindrada());

	}

}
