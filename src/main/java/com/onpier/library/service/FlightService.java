package com.onpier.library.service;


import com.onpier.library.entity.Flight;
import com.onpier.library.repo.flightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    flightRepository repo;

    public Flight saveFlight(Flight flights ) {
        return repo.save(flights);
    }

    public List<Flight> getFlights() {
        return repo.findAll();
    }
}
