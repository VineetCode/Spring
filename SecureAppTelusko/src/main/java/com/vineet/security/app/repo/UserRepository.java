package com.vineet.security.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vineet.security.app.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
 User findByUsername(String username);
}
