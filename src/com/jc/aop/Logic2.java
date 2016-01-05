package com.jc.aop;

/**
 * 不需要实现接口，但是要实现增加删除修改的具体业务
 * 用来实现使用SpringAOP CGLIB代理机制
 * */
public class Logic2 {

	public void doInsert(String name) {
		System.out.println("执行具体负责新增的业务逻辑");
		for(int i=0;i<10000000;i++){
			//延长时间
			System.out.print("");
		}
		
	}

	public void doUpdate(String name) {
		System.out.println("执行具体负责修改的业务逻辑");
		for(int i=0;i<10000000;i++){
			//延长时间
			System.out.print("");
		}
	}

	public void doDelete(String name) {
		System.out.println("执行具体负责删除的业务逻辑");
		int a = 1/0;
		for(int i=0;i<10000000;i++){
			//延长时间
			System.out.print("");
		}
		
	}
}
