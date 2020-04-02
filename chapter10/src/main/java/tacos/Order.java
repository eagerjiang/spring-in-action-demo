package tacos;

import lombok.Data;

import java.util.Date;

/**
 * @author jiangqw
 * @date 4/2/2020 5:06 PM
 */
@Data
public class Order {
    private Long id;
    private Date placedAt;
}
