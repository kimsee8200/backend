package org.example.customexception.domain.User.service;

import lombok.RequiredArgsConstructor;
import org.example.customexception.domain.User.dao.User;
import org.example.customexception.domain.User.dto.RequestUser;
import org.example.customexception.domain.User.dto.ResponseUser;
import org.example.customexception.domain.User.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public ResponseUser register(RequestUser user){
        ResponseUser responseUser = new ResponseUser(user.username(),user.password(),"");
        User saveData = new User(responseUser);

    }

}
