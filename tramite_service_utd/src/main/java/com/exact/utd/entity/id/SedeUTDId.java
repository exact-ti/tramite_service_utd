package com.exact.utd.entity.id;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class SedeUTDId implements Serializable{
	
	@Column(name="sede_id")
	private Long sedeId;
	@Column(name="utd_id")
	private Long utdId;
	
	@SuppressWarnings("unused")
	private SedeUTDId() {
		
	}
	
	public SedeUTDId(Long sedeId, Long utdId) {
		this.sedeId = sedeId;
		this.utdId = utdId;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		SedeUTDId that = (SedeUTDId) o;
		return Objects.equals(sedeId, that.sedeId) && Objects.equals(utdId, that.utdId);  
				
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
