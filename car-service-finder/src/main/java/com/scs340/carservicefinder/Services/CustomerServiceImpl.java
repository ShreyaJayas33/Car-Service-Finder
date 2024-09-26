package com.scs340.carservicefinder.Services;

import com.scs340.carservicefinder.Models.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    // In a real application, you might inject a repository here to fetch data
    @Override
    public Customer getProfile(Long id) {
        // Mock implementation for illustration purposes
        // You should replace this with real data fetching logic from a database
        return new Customer(id, "John Doe", "john.doe@example.com");
    }
}
