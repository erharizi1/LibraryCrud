package com.onpier.library.repo;


import com.onpier.library.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface flightRepository extends JpaRepository<Flight, Integer> {

}
