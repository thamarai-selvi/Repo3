package com.maven.demo1;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
@Aspect
public class LogginAspect{
	@Before("execution(*com.maven.demo1.CustomerBo.addCustomer())")
		public void logBefore(JoinPoint join)
		{
		System.out.println("Logbefore is running");
		System.out.println("Hijacked"+join.getSignature().getName());
		System.out.println("**********");
		}

	@After("execution(*com.maven.demo1.CustomerBo.addCustomer())")

	public void logAfter(JoinPoint jo)
	{
		System.out.println("Logafter is running");
		System.out.println("Hijacked"+jo.getSignature().getName());
		System.out.println("*************");
	}

}