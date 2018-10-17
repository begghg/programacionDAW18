package agosto18;

public class Errores1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int[20];
        try
        {
        	//array[-3] = 24;	
	        // int b = 0;
	        /* int a = 23/b;
	         String s = null;
	         s.equals("QQQQ");*/
        	Exception e = new Exception("Este es mi propio error.");
        	throw e;
        }
       /* catch(Exception excepcion)
        {
	         System.out.println(" Error de índice en un array");
	        // excepcion.printStackTrace();
        }
        catch(ArithmeticException excepcion)
        {
	         System.out.println(" Error division por cero");
        }
        catch(Exception excepcion) {
        System.out.println("Se ha generado un error que no es de índices, ni Aritmético");
        System.out.println("El objeto error es de tipo " + excepcion);
        }*/
        
        catch(Exception excepcion)
        {
        	excepcion.printStackTrace();
        }
        finally
        {
        	System.out.println("Se ejecuta finally");
        }

	}

}



