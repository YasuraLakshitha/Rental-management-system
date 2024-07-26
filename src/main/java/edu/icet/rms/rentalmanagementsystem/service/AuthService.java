package edu.icet.rms.rentalmanagementsystem.service;

import edu.icet.rms.rentalmanagementsystem.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final CustomerRepository repository;
}
