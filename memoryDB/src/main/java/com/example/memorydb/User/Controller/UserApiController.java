package com.example.memorydb.User.Controller;


import com.example.memorydb.User.Model.UserEntity;
import com.example.memorydb.User.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;

    @PutMapping("")
    public UserEntity create(@RequestBody UserEntity user){
        return userService.save(user);
    }

    @GetMapping ("/all")
    public List<UserEntity> findAll(){
        return userService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long Id){
        userService.delete(Id);
    }

    @GetMapping("/findId/{id}")
    public UserEntity findById(@PathVariable Long Id){
        var response =  userService.findById(Id);
        return response.get();
    }

    @GetMapping("/SventyScore")
    public List<UserEntity> findMoreThanSeventy(){
        var res = userService.findScoreLeastSeventy();
        return res;
    }
}
