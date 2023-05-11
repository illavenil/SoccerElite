package com.example.SoccerElite.SoccerElite.Repository;

import com.example.SoccerElite.SoccerElite.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Integer> {
    User findByUsername(String username);
}
