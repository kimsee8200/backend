package org.example.customexception.global.config;

import lombok.RequiredArgsConstructor;
import org.example.customexception.global.security.filter.CustomLoginFilter;
import org.example.customexception.global.security.jwt.JwtUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private final AuthenticationConfiguration authenticationConfiguration;
    private final JwtUtil jwtUtil;


    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManage(AuthenticationConfiguration configuration) throws Exception{
        return configuration.getAuthenticationManager();
    }


    @Bean
    public SecurityFilterChain filterChain (HttpSecurity http) throws Exception
    {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests((val)->
                        val.requestMatchers("/login","/").permitAll()
                                .anyRequest().authenticated()
                )
                .formLogin(AbstractHttpConfigurer::disable)
                .logout((val)->
                        val.logoutUrl("/logout")
                                .logoutSuccessUrl("/out")
                ).addFilterAt(new CustomLoginFilter(jwtUtil,authenticationManage(authenticationConfiguration)), UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

}
