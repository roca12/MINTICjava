package com.roca12.SistemaArtemisa.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import com.roca12.SistemaArtemisa.DTO.*;

/**
 * Clase que permite el acceso a la base de datos
 *
 */
public class TemarioDao {

	

	public void registrarTema(TemarioVO tema) {
		Conexion conex = new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO temario VALUES ('" 
			+ tema.getID() + "', '"
			+ tema.getSupergrupo() + "', '" 
			+ tema.getTema() + "', '" 
			+ tema.getTexto() + "', '" 
			+ tema.getComplejidad_tiempo() + "', '" 
			+ tema.getJava() + "', '"
			+ tema.getCpp() + "', '" 
			+ tema.getPy() + "', " 
			+ tema.getOrden() + ", " 
			+ tema.getSuborden() + ", '"
			+ tema.getFecha_creacion() + "', '"
			+ tema.getFecha_modificacion() + "')");
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información",
					JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println("No se Registro el temario"+e.getMessage());
		}
	}

	
	public ArrayList<TemarioVO> consultarTemario(int id) {
		ArrayList<TemarioVO> miTemario = new ArrayList<TemarioVO>();
		Conexion conex = new Conexion();

		try {
			PreparedStatement consulta = conex.getConnection()
					.prepareStatement("SELECT * FROM temario where ID = ? ");
			consulta.setInt(1, id);
			ResultSet res = consulta.executeQuery();

			if (res.next()) {
				TemarioVO tema = new TemarioVO();
				tema.setID(Integer.parseInt(res.getString("ID")));
				tema.setSupergrupo(res.getString("supergrupo"));
				tema.setTema(res.getString("tema"));
				tema.setTexto(res.getString("texto"));
				tema.setComplejidad_tiempo(res.getString("complejidad_tiempo"));
				tema.setJava(res.getString("java"));
				tema.setCpp(res.getString("cpp"));
				tema.setPy(res.getString("py"));
				tema.setOrden(res.getString("orden"));
				tema.setSuborden(res.getString("suborden"));
				tema.setFecha_creacion(res.getString("fecha_creacion"));
				tema.setFecha_modificacion(res.getString("fecha_modificacion"));
				miTemario.add(tema);
			}
			res.close();
			consulta.close();
			conex.desconectar();

		} catch (Exception e) {
			System.out.println("no se pudo consultar el tema\n" + e);
		}
		return miTemario;
	}

	
	public ArrayList<TemarioVO> listaDeTemas() {
		ArrayList<TemarioVO> miTemario = new ArrayList<TemarioVO>();
		Conexion conex = new Conexion();

		try {
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM temario");
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				TemarioVO tema = new TemarioVO();
				tema.setID(Integer.parseInt(res.getString("ID")));
				tema.setSupergrupo(res.getString("supergrupo"));
				tema.setTema(res.getString("tema"));
				tema.setTexto(res.getString("texto"));
				tema.setComplejidad_tiempo(res.getString("complejidad_tiempo"));
				tema.setJava(res.getString("java"));
				tema.setCpp(res.getString("cpp"));
				tema.setPy(res.getString("py"));
				tema.setOrden(res.getString("orden"));
				tema.setSuborden(res.getString("suborden"));
				tema.setFecha_creacion(res.getString("fecha_creacion"));
				tema.setFecha_modificacion(res.getString("fecha_modificacion"));
				miTemario.add(tema);
			}
			res.close();
			consulta.close();
			conex.desconectar();

		} catch (Exception e) {
			System.out.println("no se pudo consultar los temarios\n" + e);
		}
		return miTemario;
	}

}