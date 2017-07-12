package com.jy;

/**
 * 静态代理
 * 
 * @author jiangyu
 *
 */
public class StaticProxy implements GiveGift {
	private Pursuit mPursuit;

	public StaticProxy(SchoolGirl schoolGirl) {
		super();
		mPursuit = new Pursuit(schoolGirl);
	}

	@Override
	public void giveDolls() {
		mPursuit.giveDolls();
	}

	@Override
	public void giveFlowers() {
		mPursuit.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		mPursuit.giveChocolate();
	}

}
