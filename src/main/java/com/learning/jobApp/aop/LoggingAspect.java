package com.learning.jobApp.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    //return type class.method(args)
    @Before("execution(* com.learning.jobApp.service.JobService.*(..))")
    public void logMethodCall(){
        LOGGER.info("Method call");
    }
}
