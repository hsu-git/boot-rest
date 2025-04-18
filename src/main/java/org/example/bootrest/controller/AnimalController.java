package org.example.bootrest.controller;

import org.example.bootrest.model.domain.Animal;
import org.example.bootrest.service.AnimalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController("/api/animal")    // 이거 아님!
@RestController // Spring
@RequestMapping("/api/animal")  // 이거임!
public class AnimalController {
    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    //    @GetMapping("/hello")
//    public String hello() {
//        return "hello";
//    }
    @GetMapping
    public List<Animal> all() {
        return animalService.findAll();
    }

}
