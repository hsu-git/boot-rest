package org.example.bootrest.controller;

import org.example.bootrest.model.domain.Animal;
import org.example.bootrest.model.dto.AnimalRequestDTO;
import org.example.bootrest.service.AnimalService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Animal create (
            @RequestBody AnimalRequestDTO dto) {
        String story = "";  //  AI가 붙을 거임
        return animalService.save(dto.toAnimal(story));
    }
}
