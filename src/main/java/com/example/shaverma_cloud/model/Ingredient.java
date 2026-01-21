package com.example.shaverma_cloud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;



@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
public class Ingredient  {
    @Id
    private final String id;
    private final String name;
    private final Type type;
    public Ingredient(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
    public enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }
}


