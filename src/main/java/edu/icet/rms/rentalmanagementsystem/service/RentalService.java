package edu.icet.rms.rentalmanagementsystem.service;

import edu.icet.rms.rentalmanagementsystem.dto.Rental;

import java.util.List;

public interface RentalService {
    void addRental(Rental rental);
    void updateRental(Rental rental);
    void deleteRental(Rental rental);
    Rental findById(Long id);
    List<Rental> findAll();
}
