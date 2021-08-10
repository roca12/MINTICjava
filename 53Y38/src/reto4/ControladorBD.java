
package reto4;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladorBD {

    public ControladorBD() {
        try {
            //cargando la libreria
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar la libreria");
        }
    }
    
    Connection conexion;
    Statement sentencia;
    ResultSet resultado;
    
    //verificar y conectar
    void verificarYconectar(){
        try {
            conexion=DriverManager.getConnection("jdbc:sqlite:db_estudiantes.db");
        } catch (SQLException ex) {
            System.out.println("Error en la base de datos "+ex.getMessage());
        }
    }
    
    //crear tabla
    void crearTabla(){
        try {
            sentencia=conexion.createStatement();
            
            sentencia.execute("create table if not exists estudiantes("
                    + "nombres varchar,"
                    + "apellidos varchar,"
                    + "fecha_nacimiento varchar,"
                    + "correo_ins varchar,"
                    + "correo_per varchar,"
                    + "tel_cel int,"
                    + "tel_fijo int,"
                    + "programa_academico varchar"
                    + ")");
        } catch (SQLException ex) {
            System.out.println("Error al crear la base de datos "+ex.getMessage());
        }
    }
    
    //insertar datos en tabla
    void insertar(String nombres,String apellidos, 
            String fecha,String correoi,
            String correop, long cel,long fijo,String programa){
        try {
            sentencia= conexion.createStatement();
            sentencia.execute("insert into estudiantes values("
            + "'"+nombres+"',"
            + "'"+apellidos+"',"
            + "'"+fecha+"',"
            + "'"+correoi+"',"
            + "'"+correop+"',"
            + ""+cel+","
            + ""+fijo+","
            + "'"+programa+"'"
            + ")");
        } catch (SQLException ex) {
            System.out.println("Error al insertar datos "+ex.getMessage());
        }
        
    
    }
    
    //cerrar conexion
    void cerrarTodo(){
        try {
            sentencia.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar sentencia");
        }
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar conexion");
        }
        try {
            resultado.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar resultado");
        }
    }
}
