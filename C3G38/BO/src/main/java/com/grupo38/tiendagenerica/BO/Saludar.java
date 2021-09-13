package com.grupo38.tiendagenerica.BO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludar {
	
	@RequestMapping("/saludar")
	public String saludando() {
		return "Hola mundo";
	}

}
