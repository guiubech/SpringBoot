package com.eventos.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Table(name="tipo_evento")
@Entity
public class TipoEvento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_tipo_evento")
	private Long id;
	@NotBlank
	private String nomeProva;
	@Enumerated(EnumType.STRING)
	private Distancia distancia;
	@Enumerated(EnumType.STRING)
	private Hora hora;
	private Date dataProva;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeProva() {
		return nomeProva;
	}
	public void setNomeProva(String nomeProva) {
		this.nomeProva = nomeProva;
	}
	public Distancia getDistancia() {
		return distancia;
	}
	public void setDistancia(Distancia distancia) {
		this.distancia = distancia;
	}
	public Hora getHora() {
		return hora;
	}
	public void setHora(Hora hora) {
		this.hora = hora;
	}
	public Date getDataProva() {
		return dataProva;
	}
	public void setDataProva(Date dataProva) {
		this.dataProva = dataProva;
	}
	
	
	
	
	
	
	
	
}
