package com.jy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyPattern {

	public static void main(String[] args) {
		SchoolGirl schoolGirl = new SchoolGirl("娇娇");
		// 静态代理
		// StaticProxy staticProxy = new StaticProxy(schoolGirl);
		// staticProxy.giveDolls();
		// staticProxy.giveFlowers();
		// staticProxy.giveChocolate();

		// 动态代理
		Pursuit pursuit = new Pursuit(schoolGirl);
		InvocationHandler handler = new DynamicProxy(pursuit);
		/*
		 * 通过Proxy的newProxyInstance方法来创建我们的代理对象，我们来看看其三个参数 
		 * 第一个参数handler.getClass().getClassLoader()，我们这里使用handler这个类的ClassLoader对象来加载我们的代理对象
		 * 第二个参数pursuit.getClass().getInterfaces()，我们这里为代理对象提供的接口是真实对象所实现的接口，表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了
		 * 第三个参数handler， 我们这里将这个代理对象关联到了上方的InvocationHandler这个对象上
		 * 
		 */
		GiveGift giveGift = (GiveGift) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
				pursuit.getClass().getInterfaces(), handler);

		giveGift.giveDolls();
		giveGift.giveFlowers();
		giveGift.giveChocolate();
	}

}
