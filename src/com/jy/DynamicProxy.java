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

	/**
	 * ��̬����ģʽ����ʹ�������ڲ��ı�ԭ�����еĴ���ṹ�������,��ԭ���ġ���ʵ������������չ����ǿ�书�ܣ����ҿ��Դﵽ���Ʊ�����������Ϊ,
	 * �����before��after�������ǿ��Խ�����������������չ��
	 * 
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		/*
		 * before ��doSomething();
		 */
		Object result = method.invoke(object, args);
		/*
		 * after : doSomething();
		 */
		return result;
	}

}
