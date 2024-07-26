package edu.icet.rms.rentalmanagementsystem.repository;

import edu.icet.rms.rentalmanagementsystem.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemEntity,Long> {
}
