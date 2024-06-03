package com.tka.utility;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Message {
	@Pointcut("execution (* com.tka.entity.Account.*(..)) ")
	public void checkBeforeAfterLogic() {
		
	}
	
	@Around("checkBeforeAfterLogic()")
	public void arroundMessage(ProceedingJoinPoint p) {
		System.out.println("Before Method pin validated");
//		Pin Validation logic
		
		try {
			p.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Send SMS logic
		System.out.println("After method Sending SMS Logic");
		
	}
	
}
