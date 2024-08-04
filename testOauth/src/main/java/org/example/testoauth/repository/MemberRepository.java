package org.example.testoauth.repository;

import org.example.testoauth.domain.User.dao.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,String> {
    Optional<Member> findByEmail(String email);
}
