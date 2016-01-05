package com.jc.aop;

/**
 * Logic1实现接口
 * 具体业务逻辑
 * 实现Java动态代理的类
 * */
public class Logic1 implements LogicInterface {

	@Override
	public void doInsert(String name) {
		System.out.println("执行具体负责新增的业务逻辑");
		for(int i=0;i<10000000;i++){
			//延长时间
			System.out.print("");
		}
		
	}

	@Override
	public void doUpdate(String name) {
		System.out.println("执行具体负责修改的业务逻辑");
		for(int i=0;i<10000000;i++){
			//延长时间
			System.out.print("");
		}
	}

	@Override
	public void doDelete(String name) {
		System.out.println("执行具体负责删除的业务逻辑");
		for(int i=0;i<10000000;i++){
			//延长时间
			System.out.print("");
		}
		
	}

}
