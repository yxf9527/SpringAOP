package com.jc.aop;

import java.lang.reflect.Method;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

/**
 * ExceptionHandler负责将异常信息记录下来
 * */
public class ExceptionHandler implements ThrowsAdvice  {
	
	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	public void afterThrowing(Method method,Object[] args,Object target,Throwable subClass) throws Throwable{
		logger.log(Level.INFO, "执行"+method.getName()+"出现异常！");
	}
	
	

}
