package ArrayList_Objetos;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Arraylist_Cuentas {
	
	private static final String nombreFichero = "ctas.txt";
	
	public static void main (String args[]){
		
		// Nos creamos un ArrayList de objetos de la Clase "PartidoFutbol"
		System.out.println("... Nos creamos un ArrayList de objetos de la Clase \"Ctas bancarias\" ...");
		ArrayList<CuentaBancaria> cta = new ArrayList<CuentaBancaria>();
		
		// Instanciamos el fichero donde estan los datos
		File fichero = new File(nombreFichero);
		Scanner s = null;
		
		try {
			// Leemos el contenido del fichero
			System.out.println("... Leemos el contenido del fichero con los datos de las ctas...");
			s = new Scanner(fichero);
			// Obtengo los datos de los partidos de fútbol del fichero
			while (s.hasNextLine()){
				String linea = s.nextLine();	// Obtengo una linea del fichero (un cliente y sus datos)
				String [] cortarString = linea.split("::");		// Obtengo los datos del partido de futbol
				CuentaBancaria cuenta = new CuentaBancaria();	// Creo un objeto de la clase "CuentaBancaria"
				
				// Pongo los atributos al objeto "partido"
				cuenta.setNumeroCta(cortarString[0]);
				cuenta.setCliente(cortarString[1]);
				cuenta.setSaldo(Double.parseDouble(cortarString[2]));
				
				
				// Añadimos el objeto "cta" al ArrayList
				cta.add(cuenta);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if (s != null)
					s.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("... Guardados "+cta.size()+" datos de clientes ...");
		
		// Imprimimos los elementos del ArrayList
		System.out.println("\n... Datos Ctas bancarias ...");
		Iterator<CuentaBancaria> itrCta = cta.iterator();
		while(itrCta.hasNext()){
			CuentaBancaria cuenta= itrCta.next();
			System.out.println(cuenta.getNumeroCta() + " "
					+ cuenta.getCliente() + "-"
					+ cuenta.getSaldo());
		}
		
		/*/ Eliminamos los partidos de futbol del ArrayList, cuyo resultado
		// no sea un empate
		System.out.println("\n... Tamaño del ArrayList antes de eliminar partidos de futbol = "+partidos.size()+" ...");
		System.out.println("\n... Eliminamos los partidos de futbol cuyo resultado no sea un empate ...");
		itrPartidos = partidos.iterator();
		while(itrPartidos.hasNext()){
			PartidoFutbol partido = itrPartidos.next();
			// Si los goles no son iguale, eliminamos el partido
			if(partido.getGolesLocal() != partido.getGolesVisitante())
				itrPartidos.remove();
		}
				
		// Imprimimos los elementos del ArrayList
		System.out.println("\n... Tamaño del ArrayList despues de eliminar partidos de futbol = "+partidos.size()+" ...");
		System.out.println("\n... Resultados de los partidos de Futbol con empate ...");
		itrPartidos = partidos.iterator();
		while(itrPartidos.hasNext()){
			PartidoFutbol partido = itrPartidos.next();
			System.out.println(partido.getEquipoLocal() + " "
					+ partido.getGolesLocal() + "-"
					+ partido.getGolesVisitante() + " "
					+ partido.getEquipoVisitante());
		}*/
	}

}
