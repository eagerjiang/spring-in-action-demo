package tacos;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import tacos.repositories.OrderRepository;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author jiangqw
 * @date 4/2/2020 5:06 PM
 */
@Data
@Table(name="Taco_Order")
public class Order implements Converter, Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date placedAt;
    @ManyToMany(targetEntity = Taco.class)
    private List<Taco> tacos = new ArrayList<>();

    @Autowired
    private OrderRepository orderRepository;

    public void addDesign(Taco design) {
        this.tacos.add(design);
    }

    @PrePersist
    void placedAt() {
        this.placedAt = new Date();
    }

    @Override
    public Object convert(Object source) {
        return orderRepository.find(Long.valueOf(source.toString()));
    }

}
