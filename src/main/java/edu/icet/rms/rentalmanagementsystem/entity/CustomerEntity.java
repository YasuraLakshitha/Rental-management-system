package edu.icet.rms.rentalmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long customerId;
    private String username;
    private String password;
}
