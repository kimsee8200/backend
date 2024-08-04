package org.example.mentoringsecurity.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .authorizeHttpRequests((requests)-> requests
                        .requestMatchers("/","/home","/error").permitAll()
                        .anyRequest().authenticated()
                )
//                .formLogin((form)-> form
//                        .loginPage("/login")
//                        .permitAll()
//                )
                .formLogin(Customizer.withDefaults())
                .logout((logout)-> logout.permitAll());

        return http.build();
    }
}
