package tacos.repository;

import org.springframework.data.repository.CrudRepository;
import tacos.model.Ingredient;

public interface IngredientRepositoryJpa extends CrudRepository<Ingredient, String> {
}
