package Reto5;

import java.sql.*;
import java.util.ArrayList;

public class DBControlador {

    Connection conexion = null;
    Statement sentencia = null;
    ResultSet tablaresultados = null;

    ///////////////////////////////////////////////////
    void conectar() {

        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:bd_estudiantes.db");
        } catch (SQLException ex) {
            System.out.println("Error en la conexion " + ex.getMessage());
        }

    }
     /////////////////////////////////////////////////
    void crear() {
        try {
            sentencia = conexion.createStatement();
            sentencia.execute("CREATE TABLE IF NOT EXISTS estudiantes(\n"
                    + "nombres TEXT NOT NULL,\n"
                    + "apellidos  TEXT NOT NULL,\n"
                    + "fecha_nacimiento  TEXT NOT NULL,\n"
                    + "correo_ins  TEXT NOT NULL,\n"
                    + "correo_per  TEXT NOT NULL,\n"
                    + "tel_cel INTEGER NOT NULL,\n"
                    + "tel_fijo INTEGER NOT NULL,\n"
                    + "programa_academico TEXT NOT NULL);\n"
                    + "");
        } catch (SQLException ex) {
            System.out.println("Error al crear la tabla "+ex.getMessage());
        }
    }

    ///////////////////////////////////////////////////
    void insertar(String nombres, String apellidos,
            String fecha, String correoi,
            String correop, long cel, long fijo, String programa) {
        try {
            sentencia = conexion.createStatement();
            sentencia.execute("insert into estudiantes values("
                    + "'" + nombres + "',"
                    + "'" + apellidos + "',"
                    + "'" + fecha + "',"
                    + "'" + correoi + "',"
                    + "'" + correop + "',"
                    + "'" + cel + "',"
                    + "'" + fijo + "',"
                    + "'" + programa + "'"
                    + ")");
        } catch (SQLException ex) {
            System.out.println("Error al insertar datos " + ex.getMessage());
        }

    }

    ///////////////////////////////////////////////////
    void cerrar() {
        try {
            conexion.close();
            sentencia.close();
            tablaresultados.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar conexion" + ex.getMessage());
        }

    }

    ///////////////////////////////////////////////////
    ArrayList<EstudianteVO> consultar_todo() {
        ArrayList<EstudianteVO> lista_temporal = new ArrayList<>();
        try {
            sentencia = conexion.createStatement();
            tablaresultados = sentencia.executeQuery("select * from estudiantes;");
            while (tablaresultados.next()) {
                lista_temporal.add(new EstudianteVO(
                        tablaresultados.getString(1),
                        tablaresultados.getString(2),
                        tablaresultados.getString(3),
                        tablaresultados.getString(4),
                        tablaresultados.getString(5),
                        tablaresultados.getLong(6),
                        tablaresultados.getLong(7),
                        tablaresultados.getString(8)
                ));
            }
        } catch (SQLException ex) {
            System.out.println("Error al consultar " + ex.getMessage());
        }
        return lista_temporal;
    }

    ///////////////////////////////////////////////
    void modificar(String nemail_inst, String nemail, long ncelular, long nfijo, String nprograma) {
        try {
            sentencia.execute("UPDATE estudiantes SET correo_per = '" + nemail + "',tel_cel = '" + ncelular + "',tel_fijo = '" + nfijo + "',programa_academico = '" + nprograma + "' WHERE correo_ins = '" + nemail_inst + "'");

        } catch (SQLException ex) {
            System.out.println("Error al actualizar dato " + ex.getMessage());
        }
    }

    //////////////////////////////////////////////
    void eliminar(String correo_ins) {
        try {
            sentencia.execute("DELETE FROM estudiantes WHERE correo_ins='" + correo_ins + "'");
        } catch (SQLException ex) {
            System.out.println("Error al eliminar estudiante " + ex.getMessage());
        }

    }

    //////////////////////////////////////////////////
    EstudianteVO buscarEstudiante(String correo_ins) {
        EstudianteVO temporal = null;
        try {
            tablaresultados = sentencia.executeQuery("select * from estudiantes WHERE correo_ins='" + correo_ins + "'");
            while (tablaresultados.next()) {
                temporal = new EstudianteVO(
                        tablaresultados.getString(1),
                        tablaresultados.getString(2),
                        tablaresultados.getString(3),
                        tablaresultados.getString(4),
                        tablaresultados.getString(5),
                        tablaresultados.getLong(6),
                        tablaresultados.getLong(7),
                        tablaresultados.getString(8)
                );
            }
        } catch (SQLException ex) {
            System.out.println("Error al consultar solitario" + ex.getMessage());
        }
        return temporal;
    }

}
