package com.exact.utd.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exact.utd.entity.UsuarioUTD;

@Repository
public interface IUsuarioUTDRepository extends CrudRepository<UsuarioUTD, Long> {
	
	List<UsuarioUTD> findByIdUsuarioId(Long usuarioId);
	
}
