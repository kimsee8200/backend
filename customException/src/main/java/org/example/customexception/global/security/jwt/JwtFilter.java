package org.example.customexception.global.security.jwt;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.example.customexception.global.security.Exception.TokenExpiredException;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@RequiredArgsConstructor
public class JwtFilter extends OncePerRequestFilter {
    private final JwtUtil jwtUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String token = request.getHeader("authentication");

        if(token == null||!token.startsWith("Bearer")){
            System.out.println("token no exist");
            filterChain.doFilter(request,response);
            return;
        }
        if(jwtUtil.isExpired(token)){
            throw new TokenExpiredException();
        }

        Cookie cookie = new Cookie("token",token);
        response.addCookie(cookie);

        filterChain.doFilter(request,response);
    }
}
