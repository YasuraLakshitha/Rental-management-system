package edu.icet.rms.rentalmanagementsystem.dto;

import lombok.Data;

@Data
public class Rental {
    private Long rentalId;
    private Long customerId;
    private String rentalDate;
    private String returnDate;
    private String rentalDueDate;
    private double rentalAmount;
}
