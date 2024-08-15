package org.example.customexception.domain.User.dto;

public record ResponseUser(
        String username,
        String password,
        String role
) {
  public ResponseUser {
      if (username.equals("admin")){
          role = "admin";
      }else{
          role = "user";
      }
  }
}
