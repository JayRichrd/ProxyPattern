package com.jy;

public class ProxyPattern {

	public static void main(String[] args) {
		SchoolGirl schoolGirl = new SchoolGirl("����");
		Proxy proxy = new Proxy(schoolGirl);
		proxy.giveDolls();
		proxy.giveFlowers();
		proxy.giveChocolate();
	}

}
