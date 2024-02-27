package com.learning.jobApp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    //return type class.method(args)
    @Before("execution(* com.learning.jobApp.service.JobService.getJob(..)) || execution(* com.learning.jobApp.service.JobService.search(..))")
    public void logMethodCall(JoinPoint jp){

        LOGGER.info("Method called " + jp.getSignature().getName());

    }

    @After("execution(* com.learning.jobApp.service.JobService.getJob(..)) || execution(* com.learning.jobApp.service.JobService.search(..))")
    public void logMethodExecuted(JoinPoint jp){

        LOGGER.info("Method executed " + jp.getSignature().getName());

    }

    @AfterThrowing("execution(* com.learning.jobApp.service.JobService.getJob(..)) || execution(* com.learning.jobApp.service.JobService.search(..))")
    public void logMethodCrash(JoinPoint jp){

        LOGGER.info("Method has some issues " + jp.getSignature().getName());

    }

    @AfterReturning("execution(* com.learning.jobApp.service.JobService.getJob(..)) || execution(* com.learning.jobApp.service.JobService.search(..))")
    public void logMethodExecutedSuccess(JoinPoint jp){

        LOGGER.info("Method called successfully " + jp.getSignature().getName());

    }
}
