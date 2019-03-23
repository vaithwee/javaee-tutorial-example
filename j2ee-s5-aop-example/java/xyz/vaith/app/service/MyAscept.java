package xyz.vaith.app.service;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAscept {
    public void checkPri() {
        System.out.println("chekc pri");
    }

    public void returning(Object result) {
        System.out.println("result:" + result) ;
    }

    public Object arround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("arround before");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("arround after");
        return proceed;
    }

    public void after(Throwable throwable) {
        System.out.println("after: " + throwable.getMessage());
    }
}
