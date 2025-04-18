package org.example.bootrest.model.dto;

import org.example.bootrest.model.domain.Animal;

public record AnimalRequestDTO(String name,
                               String description) {// story 제외 (AI가 해줄거라)
    public Animal toAnimal(String story) {
        return new Animal("", name, description, story, "");
    }
}
