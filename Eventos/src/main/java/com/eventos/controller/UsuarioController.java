package com.eventos.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioController {
	
	@GetMapping("/logout") 
	public ModelAndView logout(HttpSession session) {
	session.invalidate();
	
	return new ModelAndView("/login");
}

}
