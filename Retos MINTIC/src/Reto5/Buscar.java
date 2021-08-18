package Reto5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Buscar {
    public static void main(String[] args) {
        Buscar b = new Buscar();
        b.crear();
    }

    public void crear() {
        JFrame ventana = new JFrame("Busqueda");  
        
        JPanel panel = new JPanel();  
        
        panel.setLayout(new FlowLayout());  
        
        JLabel labelbusqueda = new JLabel("    Busqueda    ");  
        JTextField busqueda= new JTextField(15);
        busqueda.setEnabled(true);
        
        JLabel labelnombre = new JLabel("    Nombre    ");  
        JTextField nombre= new JTextField(15);
        nombre.setEnabled(false);
        
        JLabel labelapellido = new JLabel("    Apellido    ");  
        JTextField apellido= new JTextField(15);
        apellido.setEnabled(false);
        
        JLabel labelnacimiento = new JLabel("Fecha de nacimiento");  
        JTextField nacimiento= new JTextField(15);
        nacimiento.setEnabled(false);
        
        JLabel labelcorreoins = new JLabel("Correo institucional");  
        JTextField correoins= new JTextField(15);
        correoins.setEnabled(false);
                 
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
        
        JButton button = new JButton();  
        button.setText("Buscar");  
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                DBControlador db = new DBControlador();
                try {
                    db.conectar();
                    db.sentencia=db.conexion.createStatement();
                    EstudianteVO encontrado = db.buscarEstudiante(busqueda.getText());
                    System.out.println(encontrado.getNombre());
                    nombre.setText(encontrado.getNombre());
                    apellido.setText(encontrado.getApellido());
                    nacimiento.setText(encontrado.getBirthday());
                    correoins.setText(encontrado.getEmail_inst());
                    correoper.setText(encontrado.getEmail());
                    celular.setText(encontrado.getCelular()+"");
                    fijo.setText(encontrado.getFijo()+"");
                    programa.setText(encontrado.getPrograma());
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
        
        panel.add(labelbusqueda);  
        panel.add(busqueda);   
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
        ventana.setSize(200, 500);  
        ventana.setLocationRelativeTo(null);  
        ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);  
        ventana.setVisible(true);  
    }
}
