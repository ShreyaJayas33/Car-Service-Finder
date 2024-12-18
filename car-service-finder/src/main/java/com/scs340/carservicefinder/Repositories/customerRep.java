package com.scs340.carservicefinder.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.scs340.carservicefinder.Services.CustomerService; // Adjust the package if needed
import com.scs340.carservicefinder.Models.Customer; // Adjust the package if needed

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface customerRep extends JpaRepository<Customer, Integer> {
    //still nothing here.
}