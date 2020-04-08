package tacos.repositories;

import tacos.Order;

/**
 * @author jiangqw
 * @date 4/6/2020 8:16 PM
 */
public interface OrderRepository {

    Order save(Order order);

    Order find(Long orderId);
}
