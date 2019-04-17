package com.eventos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eventos.entity.TipoEvento;
import com.eventos.repository.TipoEventoRepository;

@Component
public class TipoEventoService {
	
	@Autowired
	private TipoEventoRepository tipoEventoRepository;
	
	public void save(TipoEvento prova) {
		this.tipoEventoRepository.save(prova);
	}
	
	public Iterable<TipoEvento> findAll() {
		return this.tipoEventoRepository.findAll();
	}

}