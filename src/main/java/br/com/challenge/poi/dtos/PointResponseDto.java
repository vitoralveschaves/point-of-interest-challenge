package br.com.challenge.poi.dtos;

import br.com.challenge.poi.entities.PointOfInterest;

public record PointResponseDto(Long id, String name, Long x, Long y) {
    public PointResponseDto(PointOfInterest pointSaved) {
        this(pointSaved.getId(), pointSaved.getName(), pointSaved.getX(), pointSaved.getY());
    }
}
