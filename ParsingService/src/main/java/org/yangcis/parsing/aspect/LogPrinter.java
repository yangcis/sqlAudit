package org.yangcis.parsing.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class LogPrinter {
    @Pointcut(value = "@annotation(org.yangcis.parsing.aspect.LogPrintAnnotation)")
    public void pointCut() {
    }
    
    @AfterReturning(value = "pointCut()", returning = "returnValue")
    public void logPrint(JoinPoint point, Object returnValue) {
        MethodSignature signature = null;
        if (point.getSignature() instanceof MethodSignature) {
            signature = (MethodSignature) point.getSignature();
        }
        if (null == signature) {
            return;
        }
        Method method = signature.getMethod();
        LogPrintAnnotation printAnnotation = method.getAnnotation(LogPrintAnnotation.class);
        if (printAnnotation == null) {
            return;
        }
        
        String type = printAnnotation.type();
        System.out.println("---------");
        System.out.println("type is " + type);
        System.out.println("---------");
    }
}
