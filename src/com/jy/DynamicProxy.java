package com.jy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 * 
 * @author jiangyu
 *
 */
public class DynamicProxy implements InvocationHandler {
	// 被代理的对象
	private Object object;

	public DynamicProxy(Object object) {
		super();
		this.object = object;
	}

	/**
	 * 动态代理模式可以使得我们在不改变原来已有的代码结构的情况下,对原来的“真实方法”进行扩展、增强其功能，并且可以达到控制被代理对象的行为,
	 * 下面的before、after就是我们可以进行特殊代码切入的扩展点
	 * 
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		/*
		 * before ：doSomething();
		 */
		Object result = method.invoke(object, args);
		/*
		 * after : doSomething();
		 */
		return result;
	}

}
