package com.example.SoccerElite.SoccerElite.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Data
@Table(name="USER")
@Getter
@Setter
@AllArgsConstructor
public class User {
    @Id
    @Column(name = "email",unique = true,nullable = false)
    private String email;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password",nullable = false)
    private String password;


    public User(){

    }



}
