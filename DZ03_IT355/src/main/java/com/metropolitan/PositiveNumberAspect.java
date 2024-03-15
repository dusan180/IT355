package com.metropolitan;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PositiveNumberAspect {

    @Before("execution(* set*(..)) && args(value)")
    public void checkPositiveNumber(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Vrednost mora biti pozitivan broj.");
        }}

}

