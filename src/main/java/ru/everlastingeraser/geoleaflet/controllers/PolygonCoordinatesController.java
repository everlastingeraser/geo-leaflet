package ru.everlastingeraser.geoleaflet.controllers;

import lombok.*;
import org.springframework.web.bind.annotation.*;
import ru.everlastingeraser.geoleaflet.services.*;

@RestController
@AllArgsConstructor
public class PolygonCoordinatesController {

    CoordinatesService service;

    @RequestMapping("/polygon")
    public void getPolygonCoordinates(@RequestBody String coordinates) {
        service.printPolygonCoordinates(coordinates);
    }

}
