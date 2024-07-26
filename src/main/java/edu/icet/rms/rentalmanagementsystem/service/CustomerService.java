package edu.icet.rms.rentalmanagementsystem.service;

import edu.icet.rms.rentalmanagementsystem.dto.Customer;

import java.util.List;

public interface CustomerService {
    void saveCustomer(Customer customer);
    Customer retriveCustomerById(Long id);
    void updateCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    List<Customer> retriveAllCustomers();
}
