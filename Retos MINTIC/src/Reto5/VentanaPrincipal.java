package Reto5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaPrincipal {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Instituto la Floresta");

        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());

        JLabel labelnombre = new JLabel("Instituto la Floresta");

        JButton button = new JButton();
        button.setText("Insertar");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Insertar i = new Insertar();
                i.crear();
            }
        });

        JButton button2 = new JButton();
        button2.setText("Buscar");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Buscar b = new Buscar();
                b.crear();
            }
        });

        JButton button3 = new JButton();
        button3.setText("Eliminar");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eliminar el = new Eliminar();
                el.crear();
            }
        });

        JButton button4 = new JButton();
        button4.setText("Actualizar");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Modificar m = new Modificar();
                m.crear();
            }
        });

        JButton button5 = new JButton();
        button5.setText("Mostrar todos");
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tabla t= new Tabla();
                t.crear();
            }
        });

        panel.add(labelnombre);
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);

        ventana.add(panel);
        ventana.setSize(200, 200);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
