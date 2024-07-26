package edu.icet.rms.rentalmanagementsystem.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.rms.rentalmanagementsystem.dto.RentalDetails;
import edu.icet.rms.rentalmanagementsystem.entity.RentalDetailsEntity;
import edu.icet.rms.rentalmanagementsystem.repository.RentalDetailsRepository;
import edu.icet.rms.rentalmanagementsystem.service.RentalDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RentalDetailsServiceImpl implements RentalDetailsService {

    private final RentalDetailsRepository repository;

    private final ObjectMapper mapper;

    @Override
    public void saveRentalDetails(RentalDetails rentalDetails) {
        repository.save(mapper.convertValue(rentalDetails, RentalDetailsEntity.class));
    }

    @Override
    public void updateRentalDetails(RentalDetails rentalDetails) {
        repository.save(mapper.convertValue(rentalDetails, RentalDetailsEntity.class));
    }

    @Override
    public RentalDetails findRentalDetails(Long id) {
       return mapper.convertValue(repository.findById(id), RentalDetails.class);
    }

}
