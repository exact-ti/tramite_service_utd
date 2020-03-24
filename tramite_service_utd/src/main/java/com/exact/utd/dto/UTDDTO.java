package com.exact.utd.dto;

import java.io.Serializable;

import com.exact.utd.entity.UsuarioUTD;

import lombok.Data;

@Data
public class UTDDTO implements Serializable {
	
	
	public UTDDTO(UsuarioUTD usuarioUTD) {		
		id = usuarioUTD.getUtd().getId();
		nombre = usuarioUTD.getUtd().getNombre();
		principal = usuarioUTD.isPrincipal();
	}
	
	private Long id;
	private String nombre;
	private boolean principal;
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
