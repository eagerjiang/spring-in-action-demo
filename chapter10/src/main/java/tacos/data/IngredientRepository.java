package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Ingredient;

/**
 * @author jiangqw
 * @date 4/15/2020 7:09 PM
 */
public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
