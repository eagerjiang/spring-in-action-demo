package concert;

import org.aspectj.lang.Aspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author jiangqw
 * @date 2020/1/14 17:51
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class ConcertConfig {

    /*@Bean
    public Audience audience(){
        return new Audience();
    }*/

    @Bean
    public Audience audience() {
        return Aspects.aspectOf(Audience.class);
    }
}
