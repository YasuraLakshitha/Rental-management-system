package edu.icet.rms.rentalmanagementsystem.dto;

import lombok.Data;

@Data
public class Item {
    private Long itemId;
    private String itemName;
    private Double rentPerDay;
    private Double finePerDay;
    private String availability;
}
