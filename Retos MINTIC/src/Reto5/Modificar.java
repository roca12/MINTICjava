package Reto5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Modificar {
    
    public static void main(String[] args) {
        Modificar m = new Modificar();
        m.crear();
    }

    public void crear() {
        //JOptionPane.showMessageDialog(null, "hola soy un pup-up","Titulo",JOptionPane.ERROR_MESSAGE);
        JFrame ventana = new JFrame("Modificar");  
        
        JPanel panel = new JPanel();  
        
        panel.setLayout(new FlowLayout());  
        
        JLabel labelbusqueda = new JLabel("    Busqueda    "); 
        labelbusqueda.setFont(new Font("Arial",Font.BOLD,12));
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
        button2.setBackground(Color.ORANGE);
        button2.setForeground(new Color(3, 144, 252));
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                DBControlador db = new DBControlador();
                try {
                    db.conectar();
                    db.sentencia=db.conexion.createStatement();
                    EstudianteVO encontrado = db.buscarEstudiante(busqueda.getText());
                    System.out.println(encontrado.getNombre());
                    correoper.setText(encontrado.getEmail());
                    correoper.setEnabled(true);
                    celular.setText(encontrado.getCelular()+"");
                    celular.setEnabled(true);
                    fijo.setText(encontrado.getFijo()+"");
                    fijo.setEnabled(true);
                    programa.setText(encontrado.getPrograma());
                    programa.setEnabled(true);
                    db.conexion.close();
                    db.sentencia.close();
                    db.tablaresultados.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                } catch (NullPointerException ex){
                    System.out.println(ex.getMessage());
                }
            }
        });
        
        JButton button = new JButton();  
        button.setText("Guardar"); 
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                DBControlador db = new DBControlador();
                try {
                    db.conectar();
                    db.sentencia=db.conexion.createStatement();
                    db.modificar(
                            busqueda.getText(),
                            correoper.getText(), 
                            Long.parseLong(celular.getText()),
                            Long.parseLong(fijo.getText()), 
                            programa.getText());
                    JOptionPane.showMessageDialog(null, "Dato modificado con exito");
                    db.conexion.close();
                    db.sentencia.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
                    System.out.println(ex.getMessage());
                } catch (NullPointerException ex){
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
                }
            }
        });
        
        
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
