package com.scs340.carservicefinder.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.scs340.carservicefinder.Services.CustomerService; // Adjust the package if needed
import com.scs340.carservicefinder.Models.Customer; // Adjust the package if needed

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/profile/{id}")
    public Optional<Customer> getCustomerProfileById(@PathVariable int id) {
        /*Customer customer = customerService.getProfile(id);
        if (customer != null) {
            return ResponseEntity.ok(customer);
        } else {
            return ResponseEntity.notFound().build();
        }*/
        return customerService.something(id);
    }

    //gets all customers
    @GetMapping("/all")
    public Optional<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    //adding a new customer
    @PostMapping("/new")
    public List<Customer> newCustomer(@RequestBody Customer customer) {
        customerService.newCustomer(customer);
        return customerService.getAllCustomers();
    }

    //updating a customer that is in db
    @PutMapping("/update/{cusomterId}")
    public Optional<Customer> updateCustomer(@PathVariable int customerid, @RequestBody Customer customer){
        customerService.updateCustomer(customerid,customer);
    }

    //Deleting a customer by their id
    @DeleteMapping("/delete/{customerId}")
    public List<Customer> deletebyCustomerId(@PathVariable int customerid){
        customerService.deletebyId(customerid);
        return customerService.getAllCustomers();
    }


}
