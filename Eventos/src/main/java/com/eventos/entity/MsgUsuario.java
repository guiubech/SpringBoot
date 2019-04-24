package com.eventos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name="msg_usuario")
@Entity
public class MsgUsuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_msg_usuario")
	private Long id;
	
	@ManyToMany
	@JoinColumn(name="id_user")
	private Usuario usuario;
	
	@ManyToMany
	@JoinColumn(name="id_msg")
	private Msg msg;
	
	private boolean lida;

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

	public Msg getMsg() {
		return msg;
	}

	public void setMsg(Msg msg) {
		this.msg = msg;
	}

	public boolean isLida() {
		return lida;
	}

	public void setLida(boolean lida) {
		this.lida = lida;
	}
	
	

}
