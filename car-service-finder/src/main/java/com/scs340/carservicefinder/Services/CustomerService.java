package com.scs340.carservicefinder.Services;

import com.scs340.carservicefinder.Models.Customer;

public interface CustomerService {
    // Method to fetch customer profile by ID
    Customer getProfile(Long id);
}
