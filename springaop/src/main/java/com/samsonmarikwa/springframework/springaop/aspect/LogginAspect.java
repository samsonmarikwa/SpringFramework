package com.samsonmarikwa.springframework.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {

	@Before("")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("Before Calling the method");
	}

	@After("")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("After the method execution");
	}
}
