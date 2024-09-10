package br.com.challenge.poi.services.impl;

import br.com.challenge.poi.dtos.PointRequestDto;
import br.com.challenge.poi.dtos.PointResponseDto;
import br.com.challenge.poi.repositories.PointOfInterestRepository;
import br.com.challenge.poi.services.PointOfInterestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointOfInterestImpl implements PointOfInterestService {

    private final PointOfInterestRepository pointOfInterestRepository;

    public PointOfInterestImpl(PointOfInterestRepository pointOfInterestRepository) {
        this.pointOfInterestRepository = pointOfInterestRepository;
    }

    @Override
    public PointResponseDto createPoint(PointRequestDto request) {
        return new PointResponseDto(pointOfInterestRepository.save(request.toEntity()));
    }

    @Override
    public List<PointResponseDto> getPoints() {
        return pointOfInterestRepository.findAll().stream().map(PointResponseDto::new).toList();
    }

    @Override
    public List<PointResponseDto> nearMe(Long x, Long y, Long dMax) {
        var listPoints = pointOfInterestRepository.findAll();
        var listFilter = listPoints.stream().filter(point ->
                distanceBetweenPoints(x, y, point.getX(),point.getY(), dMax))
                .toList();
        return listFilter.stream().map(PointResponseDto::new).toList();
    }

    private boolean distanceBetweenPoints(Long x, Long y, Long x1, Long y1, Long dMax) {
        return Math.sqrt((Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2))) <= dMax;
    }
}
