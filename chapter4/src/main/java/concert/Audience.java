package concert;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author jiangqw
 * @date 2020/1/10 17:01
 */
@Aspect
public class Audience {

    @Before("execution(* concert.Performance.perform(..))")
    public void silenceCellPhone() {
        System.out.println("silencing cell phones");
    }

    @Before("execution(* concert.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("taking seats");
    }

    @After("execution(* concert.Performance.perform(..))")
    public void applause() {
        System.out.println("Clap Clap Clap!!!");
    }

    @AfterThrowing("execution(* concert.Performance.perform(..))")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
