package edu.icet.rms.rentalmanagementsystem.dto;

import lombok.Data;

@Data
public class Customer {
    private Long customerId;
    private String username;
    private String password;
}
