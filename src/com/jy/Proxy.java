package com.jy;

public class Proxy implements GiveGift {
	private Pursuit mPursuit;

	public Proxy(SchoolGirl schoolGirl) {
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
