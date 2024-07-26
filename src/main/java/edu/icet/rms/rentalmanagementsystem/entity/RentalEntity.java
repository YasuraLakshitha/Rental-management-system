package edu.icet.rms.rentalmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "rental")
public class RentalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long rentalId;
    private String rentalDate;
    private String rentalDueDate;
    private double rentalAmount;

}
