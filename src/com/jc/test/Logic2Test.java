package com.jc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.jc.aop.Logic2;

public class Logic2Test {
	
	public static void main(String[] args) {
		ApplicationContext ac = new FileSystemXmlApplicationContext("exception_config.xml");
		Logic2 demo = (Logic2)ac.getBean("logic2Proxy");
		//执行doDelete时抛出异常
		demo.doDelete("java");
		demo.doInsert("java");
		demo.doUpdate("java");
	}

}
