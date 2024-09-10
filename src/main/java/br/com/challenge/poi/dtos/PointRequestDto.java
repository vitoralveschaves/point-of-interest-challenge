package br.com.challenge.poi.dtos;

import br.com.challenge.poi.entities.PointOfInterest;

public record PointRequestDto(String name, Long x, Long y) {
    public PointOfInterest toEntity() {
        return new PointOfInterest(name, x, y);
    }
}
