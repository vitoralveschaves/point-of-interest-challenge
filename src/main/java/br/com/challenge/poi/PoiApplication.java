package br.com.challenge.poi;

import br.com.challenge.poi.entities.PointOfInterest;
import br.com.challenge.poi.repositories.PointOfInterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PoiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PoiApplication.class, args);
	}

	@Autowired
	private PointOfInterestRepository pointOfInterestRepository;

	@Override
	public void run(String... args) throws Exception {
		pointOfInterestRepository.save(new PointOfInterest("Lanchonete", 27L, 12L));
		pointOfInterestRepository.save(new PointOfInterest("Posto", 31L, 18L));
		pointOfInterestRepository.save(new PointOfInterest("Joalheria", 15L, 12L));
		pointOfInterestRepository.save(new PointOfInterest("Floricultura", 19L, 21L));
		pointOfInterestRepository.save(new PointOfInterest("Pub", 12L, 8L));
		pointOfInterestRepository.save(new PointOfInterest("Supermercado", 23L, 6L));
		pointOfInterestRepository.save(new PointOfInterest("Churrascaria", 28L, 2L));
	}
}
