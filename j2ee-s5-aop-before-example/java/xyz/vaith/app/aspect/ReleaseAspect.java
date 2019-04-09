package xyz.vaith.app.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ReleaseAspect {
    @After("execution(* xyz.vaith.app.service.impl.*.*(..))")
    public void release() {
        System.out.println("executing release method");
    }
}
