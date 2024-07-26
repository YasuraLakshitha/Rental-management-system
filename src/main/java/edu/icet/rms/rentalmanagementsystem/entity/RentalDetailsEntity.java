package edu.icet.rms.rentalmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "rental_details")
public class RentalDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long rentalId;
    private Long itemId;
    private Integer quantity;
}
