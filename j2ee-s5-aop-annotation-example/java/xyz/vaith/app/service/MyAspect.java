package xyz.vaith.app.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {

    @Before(value = "execution(* xyz.vaith.app.service.ProductDao.save(..))")
    public void before() {
        System.out.println("before");
    }

    @AfterReturning(pointcut = "MyAspect.pointCut1()", returning = "result")
    public void afterReturning(Object result){
        System.out.println("after returning result: " + result);
    }

    @Around(value = "execution(* xyz.vaith.app.service.ProductDao.update(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint)throws Throwable {
        System.out.println("around before");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("around after");
        return proceed;
    }

    @AfterThrowing(value = "execution(* xyz.vaith.app.service.ProductDao.delete(..))", throwing = "e")
    public void afterThowing(Throwable e) {
        System.out.println("afterThowing s : " + e.getMessage());
    }


    @After(value = "execution(* xyz.vaith.app.service.ProductDao.*(..))")
    public void finish() {
        System.out.println("method finish");
    }

    @Pointcut(value = "execution(* xyz.vaith.app.service.ProductDao.find(..))")
    public void pointCut1() {

    }

    @Pointcut(value = "execution(* xyz.vaith.app.service.ProductDao.*(..))")
    public void pointCut2() {

    }
}
