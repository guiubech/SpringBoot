package com.eventos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class CadastroController {
	
	@GetMapping("/register")
	public ModelAndView register(){
		ModelAndView model = new ModelAndView("register");
		return model;
		
	}
	


}
