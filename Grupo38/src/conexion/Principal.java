package conexion;

import java.sql.*;

public class Principal {

    public static void main(String[] args) {
        //paso 1
        // indicar ruta de la conexion
        try {
            Class.forName("org.sqlite.JDBC");

            Connection conectar_a_bd;
            conectar_a_bd = DriverManager.getConnection("jdbc:sqlite:db_estudiantes.db");

            //paso 2
            // crear tabla de ejemplo
            //paso 2.1
            // crear sentencia
            Statement enunciado = conectar_a_bd.createStatement();
            //crea una tabla dentro de la base de datos
            enunciado.execute("create table if not exists prueba (id int, nombre varchar)");
            
            
            //paso 3
            //insertando datos
            enunciado.execute("insert into prueba values(0,'rosendo')");
            enunciado.execute("insert into prueba values(1,'edwin')");
            
            //paso 4
            //trayendo datos a java
            ResultSet resultados =enunciado.executeQuery("select * from prueba");
            while (resultados.next()) {                
                System.out.println("ID: "+resultados.getInt(1));
                System.out.println("Nombre: "+resultados.getString(2));
            }
            
            //paso 5
            //cerrar conexiones
            resultados.close();
            enunciado.close();
            conectar_a_bd.close();
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar la clase controladora del conector");
        } catch (SQLException ex) {
            System.out.println("Error en la sentencia SQL" + ex.getMessage());
        }

    }

}
