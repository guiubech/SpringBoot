package com.eventos.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

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
	
	@GetMapping("/register")
	public ModelAndView register(){
		ModelAndView model = new ModelAndView("/register");
		return model;
		
	}
	


}
