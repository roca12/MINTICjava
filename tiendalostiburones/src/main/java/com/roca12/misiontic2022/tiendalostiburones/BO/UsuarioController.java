package com.roca12.misiontic2022.tiendalostiburones.BO;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roca12.misiontic2022.tiendalostiburones.DAO.UsuarioDAO;
import com.roca12.misiontic2022.tiendalostiburones.DTO.UsuarioVO;


@RestController
public class UsuarioController {
	
	/*
	 * @GetMapping obtener o buscar
	 * @PostMapping insertar o agregar
	 * @PutMapping modificar o actualizar
	 * @DeleteMapping eliminar o borrar
	 * */

	@PostMapping("/registrarusuario")
	public void registraruser(UsuarioVO user) {
		UsuarioDAO Dao = new UsuarioDAO();
		Dao.registrarUsuario(user);
	}

	@GetMapping("/consultarusuario")
	public ArrayList<UsuarioVO> consultaruser(String usuario) {
		UsuarioDAO Dao = new UsuarioDAO();

		return Dao.consultarUsuario(usuario);
	}

	@GetMapping("/listarusuarios")
	public ArrayList<UsuarioVO> listaDeusers() {
		UsuarioDAO Dao = new UsuarioDAO();
		return Dao.listaDeUsuarios();

	}

}