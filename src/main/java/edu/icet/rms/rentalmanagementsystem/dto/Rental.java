package edu.icet.rms.rentalmanagementsystem.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Rental {
    private Long rentalId;
    private String rentalDate;
    private String returnDate;
    private String rentalDueDate;
    private double rentalAmount;

}
