package com.grupo53.tienda53;

import java.io.Serializable;

 class Pais implements Serializable {


	private static final long serialVersionUID = 1L;
	Integer id;
	String nombre;

	public Pais() {

	}

	public Pais(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}