package xyz.vaith.app.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogAspect {
    @AfterReturning(returning = "rvt", pointcut = "execution(* xyz.vaith.app.service.impl.*.*(..))")
    public void log(Object rvt) {
        System.out.println("get method return value: " + rvt);
        System.out.println("log the method");
    }
}
