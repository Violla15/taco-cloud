package tacos.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import tacos.model.Ingredient;
import tacos.repository.IngredientRepositoryJpa;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private IngredientRepositoryJpa ingredientRepository;

    @Autowired
    public IngredientByIdConverter(IngredientRepositoryJpa ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepository.findById(id).orElse(null);
    }

}
