package edu.icet.rms.rentalmanagementsystem.dto;

import lombok.Data;

@Data
public class RentalDetails {
    private Long rentalId;
    private Long itemId;
    private Integer quantity;
}
