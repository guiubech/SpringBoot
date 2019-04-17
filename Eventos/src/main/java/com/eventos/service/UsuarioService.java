package com.eventos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.eventos.entity.Perfil;
import com.eventos.entity.Usuario;
import com.eventos.model.UsuarioSecurityModel;
import com.eventos.repository.UsuarioRepository;

@Component
public class UsuarioService implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String login) throws BadCredentialsException, DisabledException {

		Usuario usuario = usuarioRepository.findByLogin(login);

		if (usuario == null)
			throw new BadCredentialsException("Usuário não encontrado no sistema!");

		if (!usuario.isAtivo())
			throw new DisabledException("Usuário não está ativo no sistema!");

		return new UsuarioSecurityModel(usuario);
	}
	
	public void salvarUsuario(Usuario usuario) {
		usuario.setAtivo(true);
		
		if(usuario.getPerfil()==null) {
			Perfil perfil = Perfil.ROLE_USER;
			usuario.setPerfil(perfil);
			
		}
		
		usuario.setSenha(new BCryptPasswordEncoder().encode(usuario.getSenha()));
		this.usuarioRepository.save(usuario);
	
	}
	
	
	
}
