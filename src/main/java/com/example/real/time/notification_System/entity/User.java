package com.example.real.time.notification_System.entity;


import jakarta.persistence.Entity;
import lombok.Data;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    private Long id;
    private String username;
    private String password;

}
