package org.example.customexception.domain.User.UserDetails;

import lombok.RequiredArgsConstructor;
import org.example.customexception.domain.User.dao.User;
import org.example.customexception.domain.User.exception.UserNoExistException;
import org.example.customexception.domain.User.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username).orElseThrow(UserNoExistException::new);
        return new CustomUserDetails(user);
    }
}
