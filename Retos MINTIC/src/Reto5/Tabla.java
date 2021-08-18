package Reto5;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Tabla  {
    public static void main(String[] args) {
        Tabla t = new Tabla();
        t.crear();
    }

    public void crear(){
        //instancia de controlador
        DBControlador db= new DBControlador();
        
        //creamos la ventana con un titulo
        JFrame ventana = new JFrame("Consultar todo");
        
        //forzamos full pantalla
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        
        //desactivamos reajuste de tamaño
        ventana.setResizable(false);
         
        //arraylist con los titulos de las columnas
        List<String> columns = new ArrayList<>();
        
        //Vector de listas con los datos de la tabla
        List<String[]> values = new ArrayList<>();
        
        //modo de cerrado
        ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        //agregando titulos
        columns.add("Nombres");
        columns.add("Apellido");
        columns.add("Fecha nacimiento");
        columns.add("C. Institucional");
        columns.add("C. personal");
        columns.add("T. celular");
        columns.add("T. fijo");
        columns.add("Programa A.");
        
        //agregando datos y conectando
        db.conectar();
        ArrayList<EstudianteVO> lista_estudiantes= db.consultar_todo();
        for (int i = 0; i < lista_estudiantes.size(); i++) {
            values.add(new String[]{
                lista_estudiantes.get(i).getNombre(),
                lista_estudiantes.get(i).getApellido(),
                lista_estudiantes.get(i).getBirthday(),
                lista_estudiantes.get(i).getEmail_inst(),
                lista_estudiantes.get(i).getEmail(),
                Long.toString(lista_estudiantes.get(i).getCelular()),
                Long.toString(lista_estudiantes.get(i).getFijo()),
                lista_estudiantes.get(i).getPrograma()
            });
        }
        
        //creando nuevo modelo de tabla con los datos dados
        TableModel tableModel = new DefaultTableModel(values.toArray(new Object[][]{}), columns.toArray());
        
        //dando modelo a la tabla
        JTable table = new JTable(tableModel);
        
        //configurando modalidad de ordenamiento en la tabla
        ventana.setLayout(new BorderLayout());
        
        //agregando scroll a la ventana
        ventana.add(new JScrollPane(table), BorderLayout.CENTER);
        
        //configurando cabezal de la tabla
        ventana.add(table.getTableHeader(), BorderLayout.NORTH);
        
        //ventana ahora es visible
        ventana.setVisible(true);
        
        //cerrando conexión con tabla
        db.cerrar();
    }

}
