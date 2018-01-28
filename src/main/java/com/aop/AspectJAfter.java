package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectJAfter {

	@After("execution(* com.aop.CustomerBo.addCustomer(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("logAfter() is running!");
		System.out.println("hijacked.. : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}

}