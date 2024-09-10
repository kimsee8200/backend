package org.example.entity.user;

import jakarta.persistence.*;
import org.example.enums.user.Role;

@Entity
@Table(name = "role_list")
public class RoleEntity {

    @Id
    @GeneratedValue()
    private long id;

    @Column(name = "role")
    private Role role;

}
