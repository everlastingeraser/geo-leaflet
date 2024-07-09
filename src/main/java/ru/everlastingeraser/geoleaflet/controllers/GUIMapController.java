package ru.everlastingeraser.geoleaflet.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class GUIMapController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
