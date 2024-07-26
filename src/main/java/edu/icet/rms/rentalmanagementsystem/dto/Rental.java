package edu.icet.rms.rentalmanagementsystem.dto;

import lombok.Data;

@Data
public class Rental {
    private Long rentalId;
    private String rentalDate;
    private String rentalDueDate;
    private double rentalAmount;

}
