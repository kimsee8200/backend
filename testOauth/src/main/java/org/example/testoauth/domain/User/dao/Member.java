package org.example.testoauth.domain.User.dao;

import jakarta.persistence.*;
import lombok.*;
import org.example.testoauth.domain.role.Role;

import java.util.List;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Member {

    @Id
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String profile;
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Role role;

//    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    @JoinColumn(referencedColumnName = "role")
   // private List<RoleEntity> roles;

}
