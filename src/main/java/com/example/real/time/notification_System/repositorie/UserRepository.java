package com.example.real.time.notification_System.repositorie;

import com.example.real.time.notification_System.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}