package com.example.memorydb.User.db;

import com.example.memorydb.DB.SimpleDataRepository;
import com.example.memorydb.User.Model.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends SimpleDataRepository<UserEntity,Long> {

}
