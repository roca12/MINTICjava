package com.roca12.SistemaArtemisa.BO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {
	@RequestMapping("/prueba")
	public String mensajePrueba() {
		return "Rest funcionando sin problema";
	}

}
