package edu.icet.rms.rentalmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Item")
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long itemId;
    private String itemName;
    private Double rentPerDay;
    private Double finePerDay;
    private String availability;
}
