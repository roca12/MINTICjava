package Reto5;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Eliminar {

    public void crear() {
        JFrame ventana = new JFrame("Modificar");  
        
        JPanel panel = new JPanel();  
        
        panel.setLayout(new FlowLayout());  
        
        JLabel labelbusqueda = new JLabel("    Busqueda    ");  
        JTextField busqueda= new JTextField(15);
        busqueda.setEnabled(true);
                        
        JButton button = new JButton();  
        button.setText("Eliminar");  
        
        
        panel.add(labelbusqueda);  
        panel.add(busqueda);   
        
        
        panel.add(button);

        ventana.add(panel);
        ventana.setSize(200, 150);  
        ventana.setLocationRelativeTo(null);  
        ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);  
        ventana.setVisible(true);  
    }
}
