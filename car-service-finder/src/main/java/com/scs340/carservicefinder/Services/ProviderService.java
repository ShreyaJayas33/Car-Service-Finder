package com.scs340.carservicefinder.Services;

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

@Service
public class ProviderService {
    @Autowired
    //provider repository object used to call back for custom requests and also used for regular requests.
    private ProviderRepo prorep;

    //getting provider by their id
    public Optional<Provider> getProbyId(Integer proid){
        return prorep.findById(proid);
    }

}
