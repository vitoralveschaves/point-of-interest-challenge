package br.com.challenge.poi.controllers;

import br.com.challenge.poi.dtos.PointRequestDto;
import br.com.challenge.poi.dtos.PointResponseDto;
import br.com.challenge.poi.services.PointOfInterestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/poi")
public class PointOfInterestController {
    private final PointOfInterestService pointOfInterestService;

    public PointOfInterestController(PointOfInterestService pointOfInterestService) {
        this.pointOfInterestService = pointOfInterestService;
    }

    @PostMapping
    public ResponseEntity<PointResponseDto> createPoint(@RequestBody PointRequestDto request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(pointOfInterestService.createPoint(request));
    }

    @GetMapping
    public ResponseEntity<List<PointResponseDto>> getPoints() {
        return ResponseEntity.status(HttpStatus.OK).body(pointOfInterestService.getPoints());
    }

    @GetMapping("/near-me")
    public ResponseEntity<List<PointResponseDto>> nearMe(@RequestParam("x") Long x,
                                                         @RequestParam("y") Long y,
                                                         @RequestParam("dMax") Long dMax) {
        return ResponseEntity.status(HttpStatus.OK).body(pointOfInterestService.nearMe(x, y, dMax));
    }
}
