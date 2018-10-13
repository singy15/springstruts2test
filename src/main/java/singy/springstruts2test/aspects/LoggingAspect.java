package singy.springstruts2test.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
//    @Before("execution(* sample.mybatis.mapper..*(..))")
    @Before("execution(* singy.springstruts2test.mappers..*(..))")
    private void before(JoinPoint jp) {
        System.out.print(">>>> " + jp.getSignature().getDeclaringTypeName() + "." + jp.getSignature().getName() + "(");

        Object[] args = jp.getArgs();
        for (Object o : args) {
            System.out.print(o);
        }

        System.out.print(")");
        System.out.println("");
    }

//    @After("execution(* sample.mybatis.mapper..*(..))")
    @After("execution(* singy.springstruts2test.mappers..*(..))")
    private void after(JoinPoint jp) {
        System.out.println("<<<< " + jp.getSignature().getDeclaringTypeName() + "." + jp.getSignature().getName());
    }
}
