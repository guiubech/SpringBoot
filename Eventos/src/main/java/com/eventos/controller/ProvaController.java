package com.eventos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.eventos.entity.TipoEvento;
import com.eventos.service.TipoEventoService;

@RestController
public class ProvaController {
	
	@Autowired
	private TipoEventoService tipoEventoService;
	
	@GetMapping("/provas")
	public ModelAndView provas() {
		ModelAndView model = new ModelAndView("/provas");
		model.addObject("tipoEvento", new TipoEvento());
		return model;
	}
	
	@PostMapping("/provas")
	public ModelAndView provas(TipoEvento tipoEvento, RedirectAttributes redirectAttrs) {
		ModelAndView model = new ModelAndView("/");
		model.addObject("CadastroSucessi", tipoEvento.getNomeProva()+ " Cadastro com Sucesso");
		tipoEventoService.save(tipoEvento);
		return model;
	}

}
