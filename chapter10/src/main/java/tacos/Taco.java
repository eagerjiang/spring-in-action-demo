package tacos;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author jiangqw
 * @date 4/2/2020 4:48 PM
 */
@Data
public class Taco {
    private Long id;
    private Date createdAt;
    private String name;
    private List<Ingredient> ingredients;
}
