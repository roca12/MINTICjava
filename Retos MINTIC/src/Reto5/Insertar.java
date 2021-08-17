package Reto5;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Insertar  {

    public void crear() {
        JFrame ventana = new JFrame("Insertar estudiante");  
        
        JPanel panel = new JPanel();  
        
        panel.setLayout(new FlowLayout());  
        
        JLabel labelnombre = new JLabel("    Nombre    ");  
        JTextField nombre= new JTextField(15);
        
        JLabel labelapellido = new JLabel("    Apellido    ");  
        JTextField apellido= new JTextField(15);
        
        JLabel labelnacimiento = new JLabel("Fecha de nacimiento");  
        JTextField nacimiento= new JTextField(15);
        
        JLabel labelcorreoins = new JLabel("Correo institucional");  
        JTextField correoins= new JTextField(15);
                 
        JLabel labelcorreoper = new JLabel("Correo personal");  
        JTextField correoper= new JTextField(15);
        
        JLabel labelcelular = new JLabel("Numero celular");  
        JTextField celular= new JTextField(15);
        
        JLabel labelfijo = new JLabel("Numero fijo");  
        JTextField fijo= new JTextField(15);
        
        JLabel labelprograma = new JLabel("Programa academico");  
        JTextField programa= new JTextField(15);
        
        JButton button = new JButton();  
        button.setText("Guardar");  
        
        panel.add(labelnombre);  
        panel.add(nombre);  
        panel.add(labelapellido);
        panel.add(apellido);  
        panel.add(labelnacimiento);
        panel.add(nacimiento); 
        panel.add(labelcorreoins);
        panel.add(correoins);  
        panel.add(labelcorreoper);
        panel.add(correoper);
        panel.add(labelcelular);
        panel.add(celular); 
        panel.add(labelfijo);
        panel.add(fijo); 
        panel.add(labelprograma);
        panel.add(programa); 
        
        panel.add(button);
        
        ventana.add(panel);
        ventana.setSize(200, 450);  
        ventana.setLocationRelativeTo(null);  
        ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);  
        ventana.setVisible(true);  
    }
}
