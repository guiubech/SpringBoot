package com.eventos.util;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.eventos.entity.Perfil;
import com.eventos.entity.Usuario;
import com.eventos.repository.UsuarioRepository;

@Component
public class PostContructInit {
	
	@Autowired
    private UsuarioRepository usuarioRepository;
	
	
	
	
 
    @PostConstruct
    public void init() {
    	Usuario usuario = new Usuario(); 
    	usuario.setAtivo(true);
    	usuario.setLogin("admin");
    	usuario.setNome("Davi");
    	usuario.setPerfil(Perfil.ADMIN);
    	usuario.setSenha(new BCryptPasswordEncoder().encode("123"));
    	usuario.setEmail("guiubech@hotmail.com");
    	usuario.setSobrenome("Bechuate");
    	usuarioRepository.save(usuario);
    	
    	
    	
  

}
}
