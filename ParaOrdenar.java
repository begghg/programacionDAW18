package eval1;
import java.util.*;

class Alumnos{
	   private int nota;
	   private String nombre;
	   public void setNota(int nota){
	      this.nota = nota;
	   }
	   public int getNota( ){
	      return this.nota;
	   }
	   public void setNombre(String nombre){
	      this.nombre = nombre;
	   }
	   public String getNombre( ){
	      return this.nombre;
	   }
	}
	class ComparaNota implements Comparator{/**hay que implementar la interfazComparator y definir el método compare()*/
	   public int compare (Object alum1, Object alum2){
	      int alum1Nota = ((Alumnos)alum1).getNota( );//hacemos un casting
	      int alum2Nota = ((Alumnos)alum2).getNota( );
	      if(alum1Nota > alum2Nota){//ordenamos de mayor a menor
	         return -1;
	      }else if(alum1Nota < alum2Nota){
	         return 1;
	      }else{
	         return 0;
	      }
	   }
	}
	class ComparaNombre implements Comparator{
	   public int compare(Object alum1, Object alum2){
	      String alum1Nombre = ((Alumnos) alum1).getNombre( );
	      String alum2Nombre = ((Alumnos) alum2).getNombre( );
	      return alum1Nombre.compareTo(alum2Nombre);/**usamos el método compareTo para un orden  alfabético*/         
	   }
	}
public class ParaOrdenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumnos alumnos[ ] = new Alumnos[4];
	      alumnos[0] = new Alumnos( );
	      alumnos[0].setNota(8);
	      alumnos[0].setNombre("Ana");
	      alumnos[1] = new Alumnos( );
	      alumnos[1].setNota(6);
	      alumnos[1].setNombre("Xose");
	      alumnos[2] = new Alumnos( );
	      alumnos[2].setNota(3);
	      alumnos[2].setNombre("Carlos");
	      alumnos[3] = new Alumnos( );
	      alumnos[3].setNota(9);
	      alumnos[3].setNombre("A");
	      System.out.println("Alumnos desordenados");
	      for(int i = 0; i<alumnos.length;i++){
	         System.out.println("Alumno "+(i+1)+" Nombre: "+alumnos[i].getNombre( )+" Nota: "+alumnos[i].getNota( ));
	      }
	      Arrays.sort(alumnos, new ComparaNota( ));/**usamos el método sort para ordenar las notas*/
	      System.out.println("Alumnos ordenados por notas");
	      for(int i = 0; i<alumnos.length; i++){
	         System.out.println("Alumno "+(i+1)+" Nombre: "+alumnos[i].getNombre( )+" Nota: "+alumnos[i].getNota( ));
	      }
	      Arrays.sort(alumnos, new ComparaNombre( ));/**ahora ordenamos los nombres*/
	      System.out.println("Alumnos ordenados por nombre");
	      for(int i = 0;i<alumnos.length; i++){
	         System.out.println("Alumno "+(i+1)+" Nombre:     "+alumnos[i].getNombre( )+" Nota: "+alumnos[i].getNota( ));
	      }

	}

}




