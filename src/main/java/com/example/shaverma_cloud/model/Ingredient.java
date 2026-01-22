package com.example.shaverma_cloud.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
public class Ingredient  {
    @Id
    private final String id;
    private final String name;
    private final Type type;
    @PersistenceCreator
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


