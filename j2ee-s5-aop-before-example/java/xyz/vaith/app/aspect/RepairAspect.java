package xyz.vaith.app.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class RepairAspect {
    @AfterThrowing(pointcut = "execution(* xyz.vaith.app.service.impl.*.*(..))", throwing = "exe")
    public void repair(Throwable exe) {
        System.out.println("get execution: message = " + exe.getMessage());
    }
}
