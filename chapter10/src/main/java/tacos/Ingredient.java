package tacos;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author jiangqw
 * @date 4/2/2020 2:30 PM
 */
@Data
@AllArgsConstructor
public class Ingredient {
    private String id;
    private String name;
    private Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}