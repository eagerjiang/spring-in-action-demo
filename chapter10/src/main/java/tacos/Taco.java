package tacos;

import lombok.Data;

import java.util.Date;

/**
 * @author jiangqw
 * @date 4/2/2020 4:48 PM
 */
@Data
public class Taco {
    private Long id;
    private Date createdAt;
}
