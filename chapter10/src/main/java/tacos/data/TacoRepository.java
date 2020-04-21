package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Taco;

/**
 * @author jiangqw
 * @date 4/17/2020 4:22 PM
 */
public interface TacoRepository extends CrudRepository<Taco,Long> {
}
