package com.exact.utd.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.exact.utd.dao.IUsuarioUTDDAO;
import com.exact.utd.dto.UTDDTO;
import com.exact.utd.entity.UTD;
import com.exact.utd.entity.UsuarioUTD;
import com.exact.utd.repository.IUsuarioUTDRepository;

@Component
@Qualifier("SimpleUsuarioUTDDAO")
public class SimpleUsuarioUTDDAO implements IUsuarioUTDDAO {

	@Autowired
	IUsuarioUTDRepository usuarioUTDRepository;

	@Override
	public List<UsuarioUTD> listarUTDsDelUsuario(Long usuarioId) {
		return usuarioUTDRepository.findByIdUsuarioId(usuarioId);
	}

}
