package com.eventos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eventos.entity.Inscricao;
import com.eventos.repository.InscricaoRepository;

@Component
public class InscricaoService {
	
	@Autowired
	private InscricaoRepository inscricaoRepository;
	
	public void salvarInscricao(Inscricao inscricao) {
		inscricaoRepository.save(inscricao);
	}
	

}
