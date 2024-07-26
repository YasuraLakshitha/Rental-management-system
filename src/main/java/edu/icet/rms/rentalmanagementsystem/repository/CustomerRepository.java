package edu.icet.rms.rentalmanagementsystem.repository;

import edu.icet.rms.rentalmanagementsystem.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {
}
