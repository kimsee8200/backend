package org.example.global.auth.jwt;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.global.auth.user.CustomUesrDetailsService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

@Component
@RequiredArgsConstructor
public class jwtUtil {

    @Value("${spring.jwt.secret}")
    private String secret;
    private SecretKey secretKey;
    private static final long ACCESS_TOKEN_VALIDITY_SECONDS = 1000 * 60 * 10;

    private final CustomUesrDetailsService customUesrDetailsService;

    @PostConstruct
    public void getSecretKey() {
        secretKey = new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), Jwts.SIG.HS256.key().build().getAlgorithm());
    }

    public String jwtBuilder(Long userId) {

        return JwtBuilder

    }

}
