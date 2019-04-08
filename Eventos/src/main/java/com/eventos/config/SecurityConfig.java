package com.eventos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.eventos.service.UsuarioService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	private final static String[] PERMIT_PATH =  { "/css/**","/fonts/**",
			"/img/**","/js/**","/esqueci-minha-senha","/register", "/recuperaSenha"};

	@Autowired
	private UsuarioService usuarioService;
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http.authorizeRequests()
		.antMatchers(PERMIT_PATH).permitAll().anyRequest().authenticated().and().formLogin()
		.loginPage("/login").defaultSuccessUrl("/home", true).permitAll().and().logout().logoutUrl("/logout").permitAll();

    }


    
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        
		auth.userDetailsService(usuarioService).passwordEncoder(new BCryptPasswordEncoder());
    }
}
