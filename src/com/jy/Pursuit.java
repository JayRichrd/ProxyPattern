package com.jy;

public class Pursuit implements GiveGift {
	private SchoolGirl mSchoolGirl;

	public Pursuit(SchoolGirl mSchoolGirl) {
		super();
		this.mSchoolGirl = mSchoolGirl;
	}

	@Override
	public void giveDolls() {
		System.out.println(mSchoolGirl.getName() + ",׷����" + "����������!");
	}

	@Override
	public void giveFlowers() {
		System.out.println(mSchoolGirl.getName() + ",׷����" + "�����ʻ�!");

	}

	@Override
	public void giveChocolate() {
		System.out.println(mSchoolGirl.getName() + ",׷����" + "�����ɿ���!");

	}

}
