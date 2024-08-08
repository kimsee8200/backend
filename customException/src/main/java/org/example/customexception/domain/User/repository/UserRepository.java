package org.example.customexception.domain.User.repository;

import org.example.customexception.domain.User.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
