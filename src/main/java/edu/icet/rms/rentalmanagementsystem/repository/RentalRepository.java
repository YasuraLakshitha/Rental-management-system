package edu.icet.rms.rentalmanagementsystem.repository;

import edu.icet.rms.rentalmanagementsystem.dto.Rental;
import edu.icet.rms.rentalmanagementsystem.entity.RentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository  extends JpaRepository<RentalEntity, Long> {
}
