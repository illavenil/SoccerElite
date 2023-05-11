package com.example.SoccerElite.SoccerElite.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "ORDERS")
@Getter
@Setter
@AllArgsConstructor
public class Orders {

    @Id
    @Column(name= "order_id")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_Id", nullable = false)
    private User user;

    @ManyToMany
    @JoinTable(
            name = "ORDER_JERSEYS",
            joinColumns = @JoinColumn(name = "email"),
            inverseJoinColumns = @JoinColumn(name = "jersey_id")
    )
    private List<Jersey> jerseys;

    @Column(name = "order_date", nullable = false)
    private LocalDateTime orderDate;
}
