package edu.icet.rms.rentalmanagementsystem.controller;

import edu.icet.rms.rentalmanagementsystem.dto.Customer;
import edu.icet.rms.rentalmanagementsystem.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping("/save")
    void persist(@RequestBody Customer customer) {
        customerService.saveCustomer(customer);
    }

    @PutMapping("/update")
    void updateRental(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
    }

    @DeleteMapping("/remove")
    void deleteRental(@RequestBody Customer customer) {
        customerService.deleteCustomer(customer);
    }

    @GetMapping("/byId")
    Customer findById(@RequestParam Long id) {
        return customerService.retriveCustomerById(id);
    }

    @GetMapping("/customers")
    List<Customer> findAll(){
        return customerService.retriveAllCustomers();
    }
}
