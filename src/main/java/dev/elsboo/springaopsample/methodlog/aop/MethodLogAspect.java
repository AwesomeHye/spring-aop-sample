package dev.elsboo.springaopsample.methodlog.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class MethodLogAspect {

    @Around(value = "@within(dev.elsboo.springaopsample.methodlog.aop.ClassMethodLog)") // @ClassMethodLog 붙은 클래스의 모든 메소드에 weaving
    public Object methodLog(ProceedingJoinPoint joinPoint) throws Throwable {

        MDC.put("classMethodName", String.format("[%s][%s] ", joinPoint.getTarget().getClass().getSimpleName(), joinPoint.getSignature().getName()));

        try {
            return joinPoint.proceed();
        } finally {
            MDC.remove("classMethodName"); // 스레드 반환해도 스레드로컬에 남기 때문에 제거해줘야함
        }
    }
}
