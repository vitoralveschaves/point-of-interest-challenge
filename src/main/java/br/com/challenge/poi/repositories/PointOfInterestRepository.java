package br.com.challenge.poi.repositories;

import br.com.challenge.poi.entities.PointOfInterest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointOfInterestRepository extends JpaRepository<PointOfInterest, Long> {
}
