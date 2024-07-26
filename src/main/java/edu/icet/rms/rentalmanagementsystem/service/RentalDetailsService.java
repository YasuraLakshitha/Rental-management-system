package edu.icet.rms.rentalmanagementsystem.service;

import edu.icet.rms.rentalmanagementsystem.dto.RentalDetails;


public interface RentalDetailsService {
    void saveRentalDetails(RentalDetails rentalDetails);
    void updateRentalDetails(RentalDetails rentalDetails);
    RentalDetails findRentalDetails(Long id);
}
