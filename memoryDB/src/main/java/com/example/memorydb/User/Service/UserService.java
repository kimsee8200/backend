package com.example.memorydb.User.Service;

import com.example.memorydb.User.Model.UserEntity;
import com.example.memorydb.User.db.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public UserEntity save(UserEntity user){
        return userRepository.save(user);
    }

    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }

    public void delete(Long id) {
        userRepository.delete(id);
    }

    public Optional<UserEntity> findById(Long id) {
        return userRepository.findById(id);
    }

    public List<UserEntity> findScoreLeastSeventy(){
        return userRepository.findAll().stream().filter(val ->{
            return val.getScore()>=70;
        }).collect(Collectors.toList());
    }
}
