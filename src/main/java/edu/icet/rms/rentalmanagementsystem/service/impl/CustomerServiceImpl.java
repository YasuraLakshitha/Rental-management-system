package edu.icet.rms.rentalmanagementsystem.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.rms.rentalmanagementsystem.dto.Customer;
import edu.icet.rms.rentalmanagementsystem.entity.CustomerEntity;
import edu.icet.rms.rentalmanagementsystem.repository.CustomerRepository;
import edu.icet.rms.rentalmanagementsystem.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    private final ObjectMapper mapper;

    @Override
    public void saveCustomer(Customer customer) {
        repository.save(mapper.convertValue(customer, CustomerEntity.class));
    }

    @Override
    public Customer retriveCustomerById(Long id) {
        return mapper.convertValue(repository.findById(id), Customer.class);
    }

    @Override
    public void updateCustomer(Customer customer) {
        repository.save(mapper.convertValue(customer, CustomerEntity.class));
    }

    @Override
    public void deleteCustomer(Customer customer) {
        repository.delete(mapper.convertValue(customer, CustomerEntity.class));
    }

    @Override
    public List<Customer> retriveAllCustomers() {
        return repository.findAll().stream()
                .map(customerEntity -> mapper.convertValue(customerEntity, Customer.class)).toList();
    }
}
