package com.BO.TiendaVirtualSB;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DAO.TiendaVirtualSB.ClienteDao;
import com.VO.TiendaVirtualSB.ClienteVO;

@RestController
public class ClienteController {

	@RequestMapping("/registrarPersona")
	public void registrarPersona(ClienteVO persona) {
		ClienteDao Dao = new ClienteDao();
		Dao.registrarPersona(persona);
	}

	/**
	 * permite consultar el Cliente asociado al documento enviado como parametro
	 * 
	 * @param documento
	 * @return
	 */

	@RequestMapping("/consultarPersona")
	public ArrayList<ClienteVO> consultarPersona(int documento) {
		ClienteDao Dao = new ClienteDao();

		return Dao.consultarPersona(documento);
	}

	/**
	 * permite consultar la lista de Clientes
	 * 
	 * @return
	 */
	@RequestMapping("/listarPersonas")
	public ArrayList<ClienteVO> listaDePersonas() {
		ClienteDao Dao = new ClienteDao();
		return Dao.listaDePersonas();

	}

}