package org.example.customexception.domain.User.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.customexception.domain.User.dto.ResponseUser;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id",unique = true)
    private String userId;
    private String password;
    private String role;

    public User (ResponseUser user){
        this.userId = user.username();
        this.password = user.password();
        this.role = user.role();
    }
}
