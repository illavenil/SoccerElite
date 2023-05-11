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
@Table(name="JERSEY")
@Getter
@Setter
@AllArgsConstructor
public class Jersey {

    @Id
    @Column(name = "jersey_id")
    private UUID id;

    @Column(name = "Name",nullable = false)
    private String name;

    @Column(name ="Brand",columnDefinition = "ENUM('Adidas', 'Nike', 'Puma')")
    public String brand;

    @Column(name = "Size",columnDefinition = "ENUM('S', 'M', 'L', 'XL')")
    private String Size;

    @Column(name = "Price")
    private int price;


}
