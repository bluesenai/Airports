package br.eti.kge.airports.repositories;


import br.eti.kge.airports.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AirportRepository extends JpaRepository<Airport, Long> {
    
    
}
