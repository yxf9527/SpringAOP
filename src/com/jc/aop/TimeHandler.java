package com.jc.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * TimeHandler负责记录方法的记录时间
 * */
public class TimeHandler implements MethodInterceptor{

	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		long procTime = System.currentTimeMillis();
		logger.log(Level.INFO,"开始执行"+arg0.getMethod()+"方法！");
		try{
			Object obj = arg0.proceed();
			return obj;
		}finally{
			//计算执行时间
			procTime = System.currentTimeMillis()-procTime;
			logger.log(Level.INFO, "执行"+arg0.getMethod()+"方法结束");
			logger.log(Level.INFO, "执行"+arg0.getMethod().getName()+"方法，使用了"+procTime+"毫秒！");
		}
	}
	
	

}
