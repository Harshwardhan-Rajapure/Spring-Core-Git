package com.tka.utility;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Message {

//	For Deposit Method
	@Pointcut("execution (public void Deposit(..))")
	public void getMessage() {
		
	}
//	By After Advice
	@After("getMessage()")
	public void SendSMS(JoinPoint jt) {
		System.out.println(Arrays.toString(jt.getArgs())+" Amount Deposited...");
	}
	
//	For Withdraw Method
	@Pointcut("execution (public void Withdraw(..))")
	public void PinValid() {
		
	}
	
//	By Before Advice
	@Before("PinValid()")
	public void ValidPin(JoinPoint jt) {
		System.out.println(Arrays.toString(jt.getArgs())+" Withdraw Amount Successfully...");
	}
	
}
