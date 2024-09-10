package com.example.notes.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        System.out.println("Custom Security running");
        http.authorizeHttpRequests((requests) ->
                requests.anyRequest().authenticated());
        http.csrf(csrf -> csrf.disable());
//        http.formLogin(withDefaults());
        http.httpBasic(withDefaults());
        return http.build();
    }
}
