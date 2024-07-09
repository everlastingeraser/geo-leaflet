package ru.everlastingeraser.geoleaflet.services;

import org.springframework.stereotype.*;

@Service
public class CoordinatesService {

    public void printPolygonCoordinates(String coordinates) {
        System.out.println("Coordinates: " + coordinates);
    }
}
