package com.jy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyPattern {

	public static void main(String[] args) {
		SchoolGirl schoolGirl = new SchoolGirl("����");
		// ��̬����
		// StaticProxy staticProxy = new StaticProxy(schoolGirl);
		// staticProxy.giveDolls();
		// staticProxy.giveFlowers();
		// staticProxy.giveChocolate();

		// ��̬����
		Pursuit pursuit = new Pursuit(schoolGirl);
		InvocationHandler handler = new DynamicProxy(pursuit);
		/*
		 * ͨ��Proxy��newProxyInstance�������������ǵĴ�������������������������� 
		 * ��һ������handler.getClass().getClassLoader()����������ʹ��handler������ClassLoader�������������ǵĴ������
		 * �ڶ�������pursuit.getClass().getInterfaces()����������Ϊ��������ṩ�Ľӿ�����ʵ������ʵ�ֵĽӿڣ���ʾ��Ҫ������Ǹ���ʵ���������Ҿ��ܵ�������ӿ��еķ�����
		 * ����������handler�� �������ｫ������������������Ϸ���InvocationHandler���������
		 * 
		 */
		GiveGift giveGift = (GiveGift) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
				pursuit.getClass().getInterfaces(), handler);

		giveGift.giveDolls();
		giveGift.giveFlowers();
		giveGift.giveChocolate();
	}

}
