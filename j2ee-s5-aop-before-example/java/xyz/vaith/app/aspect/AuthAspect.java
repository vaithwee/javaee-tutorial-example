package xyz.vaith.app.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AuthAspect {
    @Before("execution(* xyz.vaith.app.service.impl.*.*(..))")
    public void authority() {
        System.out.println("executing authority method");
    }
}
