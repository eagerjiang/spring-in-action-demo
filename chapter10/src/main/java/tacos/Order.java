package tacos;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import tacos.repositories.OrderRepository;

import java.util.Date;
import java.util.List;

/**
 * @author jiangqw
 * @date 4/2/2020 5:06 PM
 */
@Data
public class Order implements Converter {
    private Long id;
    private Date placedAt;
    private List<Taco> tacos;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Object convert(Object source) {
        return orderRepository.find(Long.valueOf(source.toString()));
    }

}
