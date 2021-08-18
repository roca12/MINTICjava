package Reto5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Eliminar {
    public static void main(String[] args) {
        Eliminar e = new Eliminar();
        e.crear();
    }

    public void crear() {
        JFrame ventana = new JFrame("Eliminar");  
        
        JPanel panel = new JPanel();  
        
        panel.setLayout(new FlowLayout());  
        
        JLabel labelbusqueda = new JLabel("    Busqueda    ");  
        JTextField busqueda= new JTextField(15);
        busqueda.setEnabled(true);
                        
        JButton button = new JButton();  
        button.setText("Eliminar");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DBControlador db = new DBControlador();
                try {
                    db.conectar();
                    db.sentencia=db.conexion.createStatement();
                    db.eliminar(busqueda.getText());
                    JOptionPane.showMessageDialog(null, "Dato eliminado con exito");
                    busqueda.setText("");
                    db.conexion.close();
                    db.sentencia.close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage(),"Error al eliminar",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        
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
