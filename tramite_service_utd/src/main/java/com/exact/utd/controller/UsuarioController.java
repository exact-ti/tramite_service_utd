package com.exact.utd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exact.commons.auth.UserAuthenticated;
import com.exact.utd.dao.IUsuarioUTDDAO;
import com.exact.utd.dto.UTDDTO;
import com.exact.utd.entity.UTD;
import com.exact.utd.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	UsuarioService usuarioService;

	@Autowired
	@Qualifier("SimpleUsuarioUTDDAO")
	IUsuarioUTDDAO simpleUsuarioUTDDAO;

	@GetMapping("/utds")
	public ResponseEntity<List<UTDDTO>> listar(Authentication authentication) {
		UserAuthenticated usuario = (UserAuthenticated) authentication.getPrincipal();
		usuarioService = new UsuarioService(simpleUsuarioUTDDAO);
		return new ResponseEntity<List<UTDDTO>>(usuarioService.listarUTDsDelUsuario(Long.valueOf(usuario.getId())),
				HttpStatus.OK);
	}

}
