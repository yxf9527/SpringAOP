package com.jc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.jc.aop.Logic1;
import com.jc.aop.LogicInterface;

public class Logic1Test {
	
	public static void main(String[] args) {
		ApplicationContext ac = new FileSystemXmlApplicationContext("exception_config.xml");
		LogicInterface logic1 = (LogicInterface)ac.getBean("logic1Proxy");
		//模拟业务方法
		logic1.doInsert("Java");
		logic1.doDelete("java");
		logic1.doUpdate("java");
	}

}
