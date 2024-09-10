package org.example.global.auth.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.example.global.auth.user.CustomUesrDetailsService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Date;

@Component
@RequiredArgsConstructor
public class JwtUtil {

    @Value("${spring.jwt.secret}")
    private String secret;
    private SecretKey secretKey;
    private static final long ACCESS_TOKEN_VALIDITY_SECONDS = 1000 * 60 * 10;
    private static final long REFRESH_TOKEN_VALIDITY_SECONDS = 1000 * 60 * 60 * 24 * 2;

    private final CustomUesrDetailsService customUesrDetailsService;

    @PostConstruct
    public void getSecretKey() {
        secretKey = new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), Jwts.SIG.HS256.key().build().getAlgorithm());
    }

    public String jwtBuilder(Long userId,Long expirationTime) {
        return Jwts.builder()
                .claim("userId",userId)
                .claim("expirationTime",expirationTime)
                .expiration(new Date(System.currentTimeMillis() + expirationTime))
                .issuedAt(new Date())
                .signWith(secretKey)
                .compact();
    }

    public void makeRefreshToken(String token) {
        jwtBuilder(getUserId(token),REFRESH_TOKEN_VALIDITY_SECONDS);
    }

    public void makeAccessToken(String token) {
        jwtBuilder(getUserId(token),ACCESS_TOKEN_VALIDITY_SECONDS);
    }
    public Claims getClaimsFromToken(String token) {
        return Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token).getPayload();
    }
    public Long getUserId(String token) {
        long claims = getClaimsFromToken(token).get("userId", Long.class);
        return claims;
    }

    public boolean isExpired(String token) {
        return getClaimsFromToken(token).getExpiration().before(new Date());
    }

}
