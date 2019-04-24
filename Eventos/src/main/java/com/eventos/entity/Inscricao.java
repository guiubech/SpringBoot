package com.eventos.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="inscricao")
@Entity
public class Inscricao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  	
	@Column(name="id_inscrito")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_usuari")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="id_tipo_evento")
	private TipoEvento tipoEvento;
	
	private Date dataInscricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Date getDataInscricao() {
		return dataInscricao;
	}

	public void setDataInscricao(Date dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
	
	
	
	

}
