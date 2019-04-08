package kz.virtlabs.umbrella.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageContoller {

    @GetMapping("/img")
    public String getImage() {
        return "Next time I'll send an image!";
    }
}
