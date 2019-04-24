package com.eventos.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.eventos.entity.Inscricao;

public interface InscricaoRepository extends CrudRepository<Inscricao, Long> {
	
	@Override
	default Optional<Inscricao> findById(Long id) {
	
		return null;
	}

}
