package org.example.testoauth.domain.User.dao;

import jakarta.persistence.*;
import org.example.testoauth.domain.role.Role;

@Entity

public class RoleEntity {

    @Id
    @ManyToOne
    private Member member;
    @Enumerated(EnumType.STRING)
    @Column
    private Role role;
}
