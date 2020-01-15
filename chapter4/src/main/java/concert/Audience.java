package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author jiangqw
 * @date 2020/1/10 17:01
 */
@Aspect
public class Audience {

    @Pointcut("execution(* concert.Performance.perform(..))")
    public void performance() {

    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            System.out.println("silencing cell phones");
            System.out.println("taking seats");
            proceedingJoinPoint.proceed();
            System.out.println("Clap Clap Clap!!!");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
        }
    }
}
