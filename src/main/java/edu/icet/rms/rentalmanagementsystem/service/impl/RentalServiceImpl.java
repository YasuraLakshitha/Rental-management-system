package edu.icet.rms.rentalmanagementsystem.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.rms.rentalmanagementsystem.dto.Rental;
import edu.icet.rms.rentalmanagementsystem.entity.RentalEntity;
import edu.icet.rms.rentalmanagementsystem.repository.RentalRepository;
import edu.icet.rms.rentalmanagementsystem.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {

    private final RentalRepository repository;

    private final ObjectMapper mapper;

    @Override
    public void addRental(Rental rental) {
        repository.save(mapper.convertValue(rental, RentalEntity.class));
    }

    @Override
    public void updateRental(Rental rental) {
        repository.save(mapper.convertValue(rental, RentalEntity.class));
    }

    @Override
    public void deleteRental(Rental rental) {
        repository.delete(mapper.convertValue(rental, RentalEntity.class));
    }

    @Override
    public Rental findById(Long id) {
        return mapper.convertValue(repository.findById(id), Rental.class);
    }

    @Override
    public List<Rental> findAll() {
        return repository.findAll().stream()
                .map(rentalEntity -> mapper.convertValue(rentalEntity, Rental.class)).toList();
    }
}
