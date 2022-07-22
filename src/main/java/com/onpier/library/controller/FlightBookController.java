package com.onpier.library.controller;


import com.onpier.library.entity.Flight;
import com.onpier.library.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightBookController {


    @Autowired
    FlightService service;

    //POST - createFlight

    @RequestMapping(value="/flights", method = RequestMethod.POST)
    public ResponseEntity<Flight> createFlight(@RequestBody Flight flights) {

       Flight flight =  service.saveFlight(flights);


        return new ResponseEntity<Flight>(flight, HttpStatus.CREATED);

    }




    //GET - getFlight
    @RequestMapping(value="/flights", method = RequestMethod.GET)
    public  List<Flight> getFlight(@RequestParam(required = false) String from, @RequestParam(required = false) String to) {

        List<Flight> listOfFlights = service.getFlights();
        return listOfFlights;
    }







}
