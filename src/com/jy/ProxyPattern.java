package com.jy;

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
		DynamicProxy dynamicProxy = new DynamicProxy(pursuit);
		GiveGift giveGift = (GiveGift) Proxy.newProxyInstance(pursuit.getClass().getClassLoader(),
				new Class[] { GiveGift.class }, dynamicProxy);
		giveGift.giveDolls();
		giveGift.giveFlowers();
		giveGift.giveChocolate();
	}

}
