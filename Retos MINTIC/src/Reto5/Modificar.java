package Reto5;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Modificar {

    public void crear() {
        JFrame ventana = new JFrame("Modificar");  
        
        JPanel panel = new JPanel();  
        
        panel.setLayout(new FlowLayout());  
        
        JLabel labelbusqueda = new JLabel("    Busqueda    ");  
        JTextField busqueda= new JTextField(15);
        busqueda.setEnabled(true);
                 
        JLabel labelcorreoper = new JLabel("Correo personal");  
        JTextField correoper= new JTextField(15);
        correoper.setEnabled(false);
        
        JLabel labelcelular = new JLabel("Numero celular");  
        JTextField celular= new JTextField(15);
        celular.setEnabled(false);
        
        JLabel labelfijo = new JLabel("Numero fijo");  
        JTextField fijo= new JTextField(15);
        fijo.setEnabled(false);
        
        JLabel labelprograma = new JLabel("Programa academico");  
        JTextField programa= new JTextField(15);
        programa.setEnabled(false);
        
        JButton button2 = new JButton();  
        button2.setText("Buscar"); 
        JButton button = new JButton();  
        button.setText("Guardar");  
        
        
        panel.add(labelbusqueda);  
        panel.add(busqueda);   
        panel.add(labelcorreoper);
        panel.add(correoper);
        panel.add(labelcelular);
        panel.add(celular); 
        panel.add(labelfijo);
        panel.add(fijo); 
        panel.add(labelprograma);
        panel.add(programa); 
        
        panel.add(button);
        panel.add(button2);
        
        ventana.add(panel);
        ventana.setSize(200, 300);  
        ventana.setLocationRelativeTo(null);  
        ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);  
        ventana.setVisible(true);   
    }
}
