package com.exact.utd.entity.id;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class UsuarioUTDId implements Serializable{
	
	@Column(name="usuario_id")
	private Long usuarioId;
	@Column(name="utd_id")
	private Long utdId;
	
	@SuppressWarnings("unused")
	private UsuarioUTDId() {
		
	}
	
	public UsuarioUTDId(Long usuarioId, Long utdId) {
		this.usuarioId = usuarioId;
		this.utdId = utdId;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		UsuarioUTDId that = (UsuarioUTDId) o;
		return Objects.equals(usuarioId, that.usuarioId) && Objects.equals(utdId, that.utdId);  
				
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
