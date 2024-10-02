package com.scs340.carservicefinder.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.scs340.carservicefinder.Services.CustomerService; // Adjust the package if needed
import com.scs340.carservicefinder.Models.Customer; // Adjust the package if needed

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/profile/{id}")
    public ResponseEntity<Customer> getCustomerProfile(@PathVariable Long id) {
        Customer customer = customerService.getProfile(id);
        if (customer != null) {
            return ResponseEntity.ok(customer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
