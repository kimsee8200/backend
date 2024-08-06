package org.example.testoauth.jwt;


import io.jsonwebtoken.Jwts;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;

@RequiredArgsConstructor
@Component
public class TokenProvider {

    @Value("${jwt.key}")
    private String key;
    private SecretKey secretKey;
    private static final long ACCESS_TOKEN_EXPIRE_TIME = 1000*60*30L;
    private static final long REFRESH_TOKEN_EXPIRE_TIME = 1000*60*60L*24*7;
    private static final String KEY_ROLE = "role";


}
