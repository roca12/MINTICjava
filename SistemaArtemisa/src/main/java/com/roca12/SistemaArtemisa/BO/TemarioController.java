package com.roca12.SistemaArtemisa.BO;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.roca12.SistemaArtemisa.DAO.*;
import com.roca12.SistemaArtemisa.DTO.TemarioVO;

@RestController
public class TemarioController {

	@RequestMapping("/registrarTemario")
	public void registrarTemario(TemarioVO tema) {
		TemarioDao dao = new TemarioDao();
		dao.registrarTema(tema);
	}

	@RequestMapping("/consultarTemario")
	public ArrayList<TemarioVO> consultarTemario(int id) {
		TemarioDao dao = new TemarioDao();

		return dao.consultarTemario(id);
	}

	@RequestMapping("/listarTemario")
	public ArrayList<TemarioVO> listaDePersonas() {
		TemarioDao dao = new TemarioDao();
		return dao.listaDeTemas();
	}

}