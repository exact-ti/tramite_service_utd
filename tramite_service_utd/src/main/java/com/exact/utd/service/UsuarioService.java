package com.exact.utd.service;

import java.util.List;
import java.util.stream.Collectors;

import com.exact.utd.dao.IUsuarioUTDDAO;
import com.exact.utd.dto.UTDDTO;

public class UsuarioService {

	IUsuarioUTDDAO usuarioUTDDAO;

	public UsuarioService(IUsuarioUTDDAO usuarioUTDDAO) {
		this.usuarioUTDDAO = usuarioUTDDAO;
	}

	public List<UTDDTO> listarUTDsDelUsuario(Long usuarioId) {
		return usuarioUTDDAO.listarUTDsDelUsuario(usuarioId).stream().map(usuarioUTD -> new UTDDTO(usuarioUTD))
				.collect(Collectors.toList());
	}

}
