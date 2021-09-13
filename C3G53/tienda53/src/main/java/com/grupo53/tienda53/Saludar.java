package com.grupo53.tienda53;

import java.io.Serializable;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludar {

	@RequestMapping("/saludo")
	public String saludo() {
		return "Hola mundo soy un sevicio web (API)";
	}

	@RequestMapping("/listanum")
	public ArrayList<Integer> listanum() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			lista.add(i);
		}
		return lista;
	}

	@RequestMapping("/listapaises")
	public ArrayList<Pais> listapais() {
		ArrayList<Pais> lista = new ArrayList<>();
		lista.add(new Pais(1, "POLOMBIA"));
		lista.add(new Pais(2, "Bahrein"));
		lista.add(new Pais(3, "Rusia"));
		lista.add(new Pais(4, "Francia"));
		lista.add(new Pais(5, "España"));
		lista.add(new Pais(6, "Ucrania"));
		lista.add(new Pais(7, "Somalia"));
		return lista;
	}
}
