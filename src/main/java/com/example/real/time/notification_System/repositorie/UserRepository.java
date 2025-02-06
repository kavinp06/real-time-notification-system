package com.example.real.time.notification_System.repositorie;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}