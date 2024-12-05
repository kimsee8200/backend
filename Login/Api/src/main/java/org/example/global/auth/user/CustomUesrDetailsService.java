package org.example.global.auth.user;

import lombok.RequiredArgsConstructor;
import org.example.entity.user.UserEntity;
import org.example.repository.user.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class CustomUesrDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    public UserDetails loadUserByUserId(Long userId) throws UsernameNotFoundException {
        UserEntity user = userRepository.findById(userId).orElseThrow();
        return CustomUserDetails.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .authorities((Collection<? extends GrantedAuthority>) user.getRoles())
                .build();
    }

}
