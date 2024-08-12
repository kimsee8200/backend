package org.example.customexception.domain.User.service;

import lombok.RequiredArgsConstructor;
import org.example.customexception.domain.User.dao.User;
import org.example.customexception.domain.User.dto.RequestUser;
import org.example.customexception.domain.User.dto.ResponseUser;
import org.example.customexception.domain.User.exception.AuthFailException;
import org.example.customexception.domain.User.exception.UserAlreadyExistException;
import org.example.customexception.domain.User.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.nio.file.attribute.UserPrincipalNotFoundException;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void register(RequestUser user){
        ResponseUser responseUser = new ResponseUser(user.username(),user.password(),"");
        User saveData = new User(responseUser);

        userRepository.findByUsername(user.username()).orElseThrow(
                UserAlreadyExistException::new
        );
        userRepository.save(saveData);

    }

    public void login(RequestUser user){
        userRepository.findByUsername(user.username()).orElseThrow(AuthFailException::new);
    }

}
