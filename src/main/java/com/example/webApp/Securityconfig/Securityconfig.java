package com.example.webApp.Securityconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class Securityconfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("Admin")
//                .password("Admin123")
//                .roles("ADMIN")
//                .and()
//                .withUser("user")
//                .password("user123")
//                .roles("USER");
//    }


//    @Override
//    protected UserDetailsService userDetailsService() {
//        userDetailsService()
//                .loadUserByUsername("Admin")
//                .
//    }

    @Bean
    public PasswordEncoder pass(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeHttpRequests()
                .antMatchers("/api/v1/login").hasRole("ADMIN")
                .antMatchers("/api/v1/").hasAnyRole("ADMIN","USER")
                .and().formLogin();
    }
}
