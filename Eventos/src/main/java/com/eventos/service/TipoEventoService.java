package com.eventos.service;

import java.util.List;

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
	
	public List<TipoEvento> listarProvas() {
		List <TipoEvento> listarProvas = (List<TipoEvento>) tipoEventoRepository.findAll();
		return listarProvas;
		
	}

}