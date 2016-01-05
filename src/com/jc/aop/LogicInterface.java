package com.jc.aop;

/**
 * LogicInterface接口主要用来实现使用aop的动态代理机制
 * 业务逻辑的接口
 * */
public interface LogicInterface {
	
	public void doInsert(String name);
	
	public void doUpdate(String name);
	
	public void doDelete(String name);

}
