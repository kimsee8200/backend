package org.example.testoauth.domain.User.dao;

import com.nimbusds.oauth2.sdk.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member {

    @Id
    private String name;
    @Column
    private String email;
    @Column
    private String profile;
    @Column
    private String role;

//    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    @JoinColumn(referencedColumnName = "role")
   // private List<RoleEntity> roles;

}
