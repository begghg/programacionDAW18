package agosto18;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class JFrameBasico {
	
    public static void main(String[] args){
    	
    	JFrame ventana = new JFrame("UNED POO");
		ventana.setSize(300,200);
		ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

    }
}
