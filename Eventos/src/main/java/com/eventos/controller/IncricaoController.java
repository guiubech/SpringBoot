package com.eventos.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.eventos.entity.Inscricao;
import com.eventos.service.InscricaoService;
import com.eventos.service.TipoEventoService;
import com.eventos.util.SessionComponent;

@Controller
public class IncricaoController {
	
	@Autowired
	private InscricaoService inscricaoService;
	
	@Autowired
	private TipoEventoService tipoEventoService;
	
	@Autowired
	private SessionComponent sessionComponent;
	
	@GetMapping("/inscricao")
	public ModelAndView inscricao() {
		ModelAndView model = new ModelAndView("/inscricao");
		model.addObject("tipoEvento", tipoEventoService.listarProvas());
		model.addObject("inscricao", new Inscricao());
		return model;
	}
	
	@PostMapping("/inscricao")
	public ModelAndView inscricao(Inscricao inscricao, RedirectAttributes redirectAttrs) {
		ModelAndView model = new ModelAndView("/inscricao");
		model.addObject("cadastroSucesso", inscricao.getTipoEvento()+ " Cadastro com Sucesso");
		inscricao.setUsuario(sessionComponent.getUsuarioLogado());
		inscricao.setDataInscricao(Calendar.getInstance().getTime());
		inscricaoService.salvarInscricao(inscricao);
		return model;
	}
	
	

}
