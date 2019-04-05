package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	private final static String[] PERMIT_PATH =  {"/resources/**", "/css/**","/fonts/**",
			"/img/**","/js/**","/favicon.png","/esqueci-minha-senha","/cadastrar", "/recuperaSenha"};

	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http.authorizeRequests()
		.antMatchers(PERMIT_PATH).permitAll().anyRequest().authenticated().and().formLogin()
		.loginPage("/login").defaultSuccessUrl("/home", true).permitAll().and().logout().logoutUrl("/logout").permitAll();

    }

    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user =
             User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
    }
}
