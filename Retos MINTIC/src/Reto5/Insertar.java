package Reto5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Insertar {

    public static void main(String[] args) {
        Insertar i = new Insertar();
        i.crear();
    }

    public void crear() {
        //La ventana principal
        JFrame ventana = new JFrame("Insertar estudiante");

        //agregamos un panel
        JPanel panel = new JPanel();
        //solicitamos un ordenamiento
        panel.setLayout(new FlowLayout());
        ventana.setVisible(true);

        JLabel labelnombre = new JLabel("    Nombre    ");
        JTextField nombre = new JTextField(15);

        JLabel labelapellido = new JLabel("    Apellido    ");
        JTextField apellido = new JTextField(15);

        JLabel labelnacimiento = new JLabel("Fecha de nacimiento");
        JTextField nacimiento = new JTextField(15);

        JLabel labelcorreoins = new JLabel("Correo institucional");
        JTextField correoins = new JTextField(15);

        JLabel labelcorreoper = new JLabel("Correo personal");
        JTextField correoper = new JTextField(15);

        JLabel labelcelular = new JLabel("Numero celular");
        JTextField celular = new JTextField(15);

        JLabel labelfijo = new JLabel("Numero fijo");
        JTextField fijo = new JTextField(15);

        JLabel labelprograma = new JLabel("Programa academico");
        JTextField programa = new JTextField(15);

        JButton button = new JButton();
        button.setText("Guardar");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DBControlador db = new DBControlador();
                try {
                    db.conectar();
                    db.crear();
                    db.insertar(
                            nombre.getText(),
                            apellido.getText(),
                            nacimiento.getText(),
                            correoins.getText(),
                            correoper.getText(),
                            Long.parseLong(celular.getText()),
                            Long.parseLong(fijo.getText()),
                            programa.getText());
                    JOptionPane.showMessageDialog(null, "Dato insertado con exito");
                    db.conexion.close();
                    db.sentencia.close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, 
                            "Error: " + ex.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });

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
        ventana.setResizable(false);
        ventana.setVisible(true);
    }
}
