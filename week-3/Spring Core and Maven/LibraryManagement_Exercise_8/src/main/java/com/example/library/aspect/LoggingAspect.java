package com.example.library.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.example.library.service.BookService.showBooks(..))")
    public void logBefore() {
        System.out.println("[LOG] Before executing showBooks()");
    }

    @After("execution(* com.example.library.service.BookService.showBooks(..))")
    public void logAfter() {
        System.out.println("[LOG] After executing showBooks()");
    }
}
