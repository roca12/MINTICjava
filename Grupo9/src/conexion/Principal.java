
package conexion;

//cargando todas las clases de SQL
import java.sql.*;


public class Principal {
    
    public static void main(String[] args) {
        
        try {
            //cargar libreria
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar la liberia");
        }
        
        try {
            //establecer conexion
            Connection conexion= DriverManager.getConnection("jdbc:sqlite:db_estudiantes.db");
            
            //enunciados o sentencias
            Statement sentencia;
            
            //crear tabla
            sentencia=conexion.createStatement();
            sentencia.execute("create table if not exists estudiantes"
                    + "(nombre varchar,apellidos varchar, fecha varchar, correoi varchar"
                    + ", correop varchar, celular int, fijo int, programa varchar)");
            
            
            //guardar en bd
            sentencia.execute("insert into estudiantes values('Luis','poveda','1980-05-29','lpovedag@lafloresta.edu.co',"
                    + "'luisp@hotmail.com',3167556688,2916565,'contaduria')");
            
        } catch (SQLException ex) {
            System.out.println("Error al conectar a la base de datos "+ex.getMessage());
        }
        
        
        
    }
    
}
