package com.jy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��̬����
 * 
 * @author jiangyu
 *
 */
public class DynamicProxy implements InvocationHandler {
	// ������Ķ���
	private Object object;

	public DynamicProxy(Object object) {
		super();
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(object, args);
		return result;
	}

}
