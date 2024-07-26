package edu.icet.rms.rentalmanagementsystem.controller;

import edu.icet.rms.rentalmanagementsystem.dto.Rental;
import edu.icet.rms.rentalmanagementsystem.service.RentalDetailsService;
import edu.icet.rms.rentalmanagementsystem.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/rental")
@RequiredArgsConstructor
public class RentalController {

    private final RentalService rentalService;

    private final RentalDetailsService rentalDetailsService;

    @PostMapping("/save")
    void persist(@RequestBody Rental rental) {
        rentalService.addRental(rental);
    }

    @PutMapping("/update")
    void updateRental(@RequestBody Rental rental) {
        rentalService.updateRental(rental);
    }

    @DeleteMapping("/remove")
    void deleteRental(@RequestBody Rental rental) {
        rentalService.deleteRental(rental);
    }

    @GetMapping("/byId")
    Rental findById(@RequestParam Long id) {
        return rentalService.findById(id);
    }

    @GetMapping("/rentals")
    List<Rental> findAll(){
       return rentalService.findAll();
    }
}
