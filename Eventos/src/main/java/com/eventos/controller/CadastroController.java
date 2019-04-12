package com.eventos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.eventos.entity.Usuario;
import com.eventos.service.UsuarioService;


@RestController
public class CadastroController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/register")
	public ModelAndView register() {
		ModelAndView model = new ModelAndView("/register");
		model.addObject("usuario", new Usuario());
		return model;
	}
	
	@PostMapping("/register")
	public ModelAndView register(Usuario usuario, RedirectAttributes redirectAttrs) {
		ModelAndView model = new ModelAndView("/login");
		model.addObject("cadastroSucesso", usuario.getNome() + " Cadastrado com Sucesso");
		usuarioService.salvarUsuario(usuario);
		return model;
	}
	


}
