package com.example.SoccerElite.SoccerElite.Repository;

import com.example.SoccerElite.SoccerElite.Model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Orders, Integer> {
}
