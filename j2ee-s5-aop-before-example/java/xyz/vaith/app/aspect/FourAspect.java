package xyz.vaith.app.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import javax.xml.ws.RespectBinding;

@Aspect
public class FourAspect {
    @Before("execution(* xyz.vaith.app.service.impl.*.*(..))")
    public void log(JoinPoint pt) {
        System.out.println(pt.getClass());
        System.out.println(pt.getArgs());
    }
}
