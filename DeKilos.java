package agosto18;
/*
Ejercicio 4: Hacer un programa que pase de Kg a otra unidad de medida de masa, 
mostrar en pantalla un menú con las opciones posibles. 
*/


import javax.swing.JOptionPane;
public class DeKilos {

	public static void main(String[] args) {
		
		    float medida;
	        int opcion;
	        String nombre;
	        
	        medida = Float.parseFloat(JOptionPane.showInputDialog("Digite los kilogramos: "));
	        nombre =JOptionPane.showInputDialog("NOmbre:");
	        JOptionPane.showMessageDialog(null, "tu nombre es es: "+nombre);
      
	        opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU\n"
	        + "1. Hectogramos\n"
	        + "2. Decagramos\n"
	        + "3. Gramos\n"
	        + "4. Decigramos\n"
	        + "5. Centigramos\n"
	        + "6. Miligramos\n"));
	        
	        switch(opcion){
	            case 1: medida *= 10; 
	                    JOptionPane.showMessageDialog(null,"La medida en Hectogramos es: "+medida);
	                    break;
	            case 2: medida *= 100; 
	                    JOptionPane.showMessageDialog(null,"La medida en Decagramos es: "+medida);
	                    break;
	            case 3: medida *= 1000; 
	                    JOptionPane.showMessageDialog(null,"La medida en Gramos es: "+medida);
	                    break;
	            case 4: medida *= 10000; 
	                    JOptionPane.showMessageDialog(null,"La medida en Decigramos es: "+medida);
	                    break;
	            case 5: medida *= 100000; 
	                    JOptionPane.showMessageDialog(null,"La medida en Centigramos es: "+medida);
	                    break;
	            case 6: medida *= 1000000; 
	                    JOptionPane.showMessageDialog(null,"La medida en Miligramos es: "+medida);
	                    break;
	            default: JOptionPane.showMessageDialog(null,"Error");break;
	        }   
	        	          
	    }
	  
	}


