package com.eventos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eventos.entity.Inscricao;
import com.eventos.entity.Msg;
import com.eventos.repository.MsgRepository;

@Component
public class MsgUsuarioService {
	
	@Autowired
	private MsgRepository msgRepository;
	
	public void CadastrarMsg(Inscricao inscricao) {
		String dist = inscricao.getTipoEvento().getDistancia().toString();
		Msg msg;
		switch (dist) {
		case "CINCO":
			 
			break;

		default:
			break;
		}
		
	}

}
