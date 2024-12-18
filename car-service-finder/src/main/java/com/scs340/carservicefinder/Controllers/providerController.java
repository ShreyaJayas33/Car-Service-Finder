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
@RequestMapping("/api/providers")
public class providerController {

    @Autowired
    private ProviderService providerService;

    @GetMapping("/{providerid")
    public ResponseEntity<Provider> getprovider(@PathVariable int id){
        return providerService.getProById(id);
    }
}
