package edu.icet.rms.rentalmanagementsystem.dto;

import lombok.Data;

@Data
public class Customer {
    private Long customerId;
    private String customerName;
    private String customerEmail;
    private String username;
    private String password;
}
