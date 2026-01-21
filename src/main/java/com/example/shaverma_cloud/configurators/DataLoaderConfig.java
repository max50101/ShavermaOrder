package com.example.shaverma_cloud.configurators;

import com.example.shaverma_cloud.model.Ingredient;
import com.example.shaverma_cloud.repository.IngredientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import com.example.shaverma_cloud.model.Ingredient.Type;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
@Slf4j
public class DataLoaderConfig {

    @Bean
    public ApplicationRunner dataLoader(IngredientRepository ingredientRepository){
        return args ->{

            if(ingredientRepository.count()==0){
                log.info("Adding one more");
                ingredientRepository.saveAll(List.of(
                        new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
                        new Ingredient("COTO", "Corn Tortilla", Type.WRAP),
                        new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
                        new Ingredient("CARN", "Carnitas", Type.PROTEIN),
                        new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES),
                        new Ingredient("LETC", "Lettuce", Type.VEGGIES),
                        new Ingredient("CHED", "Cheddar", Type.CHEESE),
                        new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
                        new Ingredient("SLSA", "Salsa", Type.SAUCE),
                        new Ingredient("SRCR", "Sour Cream", Type.SAUCE)
                ));
            }
        };
    }
}
