package com.api.repository;

import com.api.entitites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User , String> {
  // User findByEmail(String email);
   public Optional<User> findByEmailAndPassword(String email, String password);
//
  public Optional<User> findByEmail(String email);
}
