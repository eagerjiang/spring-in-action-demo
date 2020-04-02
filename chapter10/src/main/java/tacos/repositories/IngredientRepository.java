package tacos.repositories;

import tacos.Ingredient;

/**
 * @author jiangqw
 * @date 4/2/2020 6:26 PM
 */
public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);

}
