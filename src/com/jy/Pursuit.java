package com.jy;

public class Pursuit implements GiveGift {
	private SchoolGirl mSchoolGirl;

	public Pursuit(SchoolGirl mSchoolGirl) {
		super();
		this.mSchoolGirl = mSchoolGirl;
	}

	@Override
	public void giveDolls() {
		System.out.println(mSchoolGirl.getName() + ",追求者" + "送你洋娃娃!");
	}

	@Override
	public void giveFlowers() {
		System.out.println(mSchoolGirl.getName() + ",追求者" + "送你鲜花!");

	}

	@Override
	public void giveChocolate() {
		System.out.println(mSchoolGirl.getName() + ",追求者" + "送你巧克力!");

	}

}
