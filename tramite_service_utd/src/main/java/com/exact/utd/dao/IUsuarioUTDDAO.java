package com.exact.utd.dao;

import java.util.List;

import com.exact.utd.entity.UTD;
import com.exact.utd.entity.UsuarioUTD;

public interface IUsuarioUTDDAO {
	
	List<UsuarioUTD> listarUTDsDelUsuario(Long usuarioId);
}
