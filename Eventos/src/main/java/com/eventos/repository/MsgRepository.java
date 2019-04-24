package com.eventos.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.eventos.entity.Msg;

public interface MsgRepository extends CrudRepository<Msg, Long> {
	
	
}
