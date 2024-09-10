package br.com.challenge.poi.services;

import br.com.challenge.poi.dtos.PointRequestDto;
import br.com.challenge.poi.dtos.PointResponseDto;

import java.util.List;

public interface PointOfInterestService {
    PointResponseDto createPoint(PointRequestDto request);
    List<PointResponseDto> getPoints();
    List<PointResponseDto> nearMe(Long x, Long y, Long dMax);
}
