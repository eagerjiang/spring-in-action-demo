package spittr.data;

import spittr.Spittle;

import java.util.List;

/**
 * @author jiangqw
 * @date 2020/2/2 19:42
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long spittleId);
}
