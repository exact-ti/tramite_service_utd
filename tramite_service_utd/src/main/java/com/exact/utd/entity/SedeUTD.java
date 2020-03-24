package com.exact.utd.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.exact.utd.entity.id.SedeUTDId;

import lombok.Data;

@Entity
@Table(name="sede_utd")
@Data
public class SedeUTD {
	
	@EmbeddedId
	private SedeUTDId id;
	
	@ManyToOne
	@MapsId("utdId")
	@JoinColumn(name="utd_id")
	private UTD utd;
	
}
