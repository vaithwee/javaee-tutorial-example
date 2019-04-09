package xyz.vaith.app.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TxAspect {
    @Around("execution(* xyz.vaith.app.service.impl.*.*(..))")
    public Object processTX(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("get method params");
        Object[] params = pjp.getArgs();
        if (params!=null && params.length > 1) {
            params[0] = "processTX:" + params[0];
        }

        Object rvt = pjp.proceed(params);
        if (rvt!=null && rvt instanceof Integer) {
            return (Integer)rvt * (Integer) rvt;
        }
        return rvt;
    }
}
