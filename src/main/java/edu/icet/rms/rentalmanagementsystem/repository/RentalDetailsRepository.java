package edu.icet.rms.rentalmanagementsystem.repository;

import edu.icet.rms.rentalmanagementsystem.dto.RentalDetails;
import edu.icet.rms.rentalmanagementsystem.entity.RentalDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalDetailsRepository extends JpaRepository<RentalDetailsEntity, Long> {
}
