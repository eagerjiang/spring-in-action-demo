package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Order;

/**
 * @author jiangqw
 * @date 4/17/2020 4:27 PM
 */
public interface OrderRepository extends CrudRepository<Order,Long> {
}
