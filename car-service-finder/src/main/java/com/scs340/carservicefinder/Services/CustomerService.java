package com.scs340.carservicefinder.Services;

import com.scs340.carservicefinder.Models.Customer;
import org.springframework.beans.facotry.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private customerRep cusrep;

    // Method to fetch customer profile by ID
    public List<Customer> getCusById(Integer customerid){
        return cusrep.findById(customerid);
    }

    //get all customers
    public List<Customer> getAllCustomers() {
        return cusrep.findAll();
    }

    //creating a new customer
    public void newCustomer(Customer customer){
        cusrep.save(customer);
    }

    //updating a current customer profile
    public void updateCustomer(Integer customerid, Customer customer){
        cusrep.save(customer);
    }

    public void deletebyId(int customerid){
        cusrep.deleteById(customerid);
    }

}
