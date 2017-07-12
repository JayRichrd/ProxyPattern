package com.jy;

/**
 * ¾²Ì¬´úÀí
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
