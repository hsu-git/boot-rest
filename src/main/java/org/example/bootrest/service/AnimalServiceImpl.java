package org.example.bootrest.service;

import org.example.bootrest.model.domain.Animal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {
    @Override
    public List<Animal> findAll() {
        return List.of();
    }

    @Override
    public Animal save(Animal animal) {
        return null;
    }
}
